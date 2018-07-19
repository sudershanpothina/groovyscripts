package org.test
class Utilities {
  static def testPrint(script,args) {
		print "${args}"
		script.sh "echo ${args}"
	 }
}