package org.scalasteward.core.data

import org.http4s.Uri

final case class PossibleChangelogUrlTuple(vcsSpecificReleaseNoteUrl: Option[Uri], changelogFileUrl: Option[Uri])
