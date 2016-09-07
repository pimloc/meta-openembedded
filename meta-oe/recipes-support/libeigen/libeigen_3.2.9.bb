DESCRIPTION = "Eigen is a C++ template library for linear algebra: matrices, vectors, numerical solvers, and related algorithms."
AUTHOR = "Benoît Jacob and Gaël Guennebaud and others"
HOMEPAGE = "http://eigen.tuxfamily.org/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING.MPL2;md5=815ca599c9df247a0c7f619bab123dad"

SRC_URI = " \
	http://bitbucket.org/eigen/eigen/get/${PV}.tar.bz2 \
	file://cmake-1.patch \
	file://cmake-2.patch \
	file://cmake-3.patch \
"

SRC_URI[md5sum] = "de11bfbfe2fd2dc4b32e8f416f58ee98"
SRC_URI[sha256sum] = "4d1e036ec1ed4f4805d5c6752b76072d67538889f4003fadf2f6e00a825845ff"

S = "${WORKDIR}/eigen-eigen-dc6cfdf9bcec"

inherit cmake

FILES_${PN}-dev += "${libdir}/cmake"

RDEPENDS_${PN}-dev = ""
PACKAGES = "${PN}-dev"
