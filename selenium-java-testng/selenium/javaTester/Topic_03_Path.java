package javaTester;

public class Topic_03_Path {
    public static void main(String[] args) {
        //Lay duong dan tuong doi cua thu muc chua code hien tai
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        //He dieu hanh
        String osName = System.getProperty("os.name");
        System.out.println(osName);
    }

}
