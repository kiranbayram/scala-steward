package org.scalasteward.core.data

import org.http4s.Uri

final case class ChangelogUrls(fileUrls: List[Uri], releaseNotesUrls: List[Uri])
