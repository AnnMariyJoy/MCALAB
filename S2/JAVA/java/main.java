import java.io.File;
public class main {
public static void main(String args[]) {
String directoryPath = "/home/lab2/Desktop/java";
listFilesAndDirectories(directoryPath);
String searchFileName = "main.java";
searchFile(directoryPath,searchFileName);
}
public static void listFilesAndDirectories(String directoryPath) {
File directory = new File(directoryPath);
String[] fileList = directory.list();
if(fileList != null) {
System.out.println("list of files and directories:");
for(String name : fileList) {
System.out.println(name);
}
}else {
System.out.println("Directory not found or is empty.");
}
}
public static void searchFile(String directoryPath, String fileName) {
File directory = new File(directoryPath);
File[] files = directory.listFiles();
if (files != null) {
boolean found = false;
for(File file : files) {
if(file.getName().equals(fileName)) {
found=true;
break;
}
}
if(found) {
System.out.println(fileName + "found in the directory");
} else {
System.out.println(fileName + "not found in the directory");
}
}else {
System.out.println("Directory not found or is empty");
}
}
}
