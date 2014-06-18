package org.zooper.gradle

import org.gradle.api.Project

class GetLocalizationPluginExtension {

  def String user = null
  def String password = null
  def String project = null
  def int progress = 50
  def iana_codes = [
    "bg-BG": "bg",
    "cs-CZ": "cs",
    "pt-PT": "pt",
    "pt-BR": "pt-rBR",
    "hr-HR": "hr",
    "hu-HU": "hu",
    "ja-JP": "ja",
    "no": "no,nb",
    "sk-SK": "sk",
    "tr-TR": "tr",
    "zh-TW" : "zh-rTW",
    "zh-CN" : "zh-rCN",
  ]

  public GetLocalizationPluginExtension(Project project) {
  }
}

