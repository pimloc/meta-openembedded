require postgresql.inc

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=3a9c1120056a102a8c8c4013cd828dce"

PR = "${INC_PR}.0"

SRC_URI += "\
    file://not-check-libperl.patch \
"

SRC_URI[md5sum] = "92ae6d7cdf18e648b3c22d0aa015565d"
SRC_URI[sha256sum] = "e5101e0a49141fc12a7018c6dad594694d3a3325f5ab71e93e0e51bd94e51fcd"
