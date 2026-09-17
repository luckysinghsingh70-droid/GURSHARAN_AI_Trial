#!/bin/sh
set -eu

GRADLE_VERSION="8.7"
CACHE_DIR="${HOME}/.cache/gursharan-ai/gradle-${GRADLE_VERSION}"
DIST_DIR="${CACHE_DIR}/gradle-${GRADLE_VERSION}"
ZIP_FILE="${CACHE_DIR}/gradle-${GRADLE_VERSION}-bin.zip"

if command -v gradle >/dev/null 2>&1; then
  exec gradle "$@"
fi

if [ ! -x "${DIST_DIR}/bin/gradle" ]; then
  mkdir -p "${CACHE_DIR}"
  if [ ! -f "${ZIP_FILE}" ]; then
    echo "Downloading Gradle ${GRADLE_VERSION}..."
    curl -fL --retry 3 -o "${ZIP_FILE}.tmp" "https://services.gradle.org/distributions/gradle-${GRADLE_VERSION}-bin.zip"
    mv "${ZIP_FILE}.tmp" "${ZIP_FILE}"
  fi
  rm -rf "${DIST_DIR}"
  unzip -q "${ZIP_FILE}" -d "${CACHE_DIR}"
fi

exec "${DIST_DIR}/bin/gradle" "$@"
