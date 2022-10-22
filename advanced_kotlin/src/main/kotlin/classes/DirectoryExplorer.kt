package classes

class DirectoryExplorer(val user: String) {

     // private
     // inner
     inner class PermissionCheck() {
        fun validatePermission() {
            if (user != "Kaden") {

            }
        }

    }
    fun listFolder(folder: String, user: String) {

        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}

fun main() {

    val de = DirectoryExplorer("Kaden")

    val pc = DirectoryExplorer("Kaden").PermissionCheck()
}
