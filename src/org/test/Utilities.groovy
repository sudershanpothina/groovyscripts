package org.test
class Utilities {
  static def testPrint(args) {
		print "${args}"
		sh "echo ${args}"
	 }
}