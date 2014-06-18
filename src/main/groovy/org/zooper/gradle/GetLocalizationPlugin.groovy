package org.zooper.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.ProjectConfigurationException

class GetLocalizationPlugin implements Plugin<Project> {

    void apply(Project project) {
        if (!(project.plugins.hasPlugin('android')
                || project.plugins.hasPlugin('android-library'))) {
            throw new ProjectConfigurationException(
                    "the 'android' or 'android-library' plugin must be applied.", null
            )
        }

        // Add decoration
        project.extensions.create('getlocalization', GetLocalizationPluginExtension, project)

        // Add task
        project.task('downloadTranslations', type: GetLocalizationDownloadTask, group: 'GetLocalization')
    }
}

