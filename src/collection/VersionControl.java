package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class VersionControl {
    private Vector<String> versions = new Vector<>();
    private Stack<String> history = new Stack<>();
    private ArrayList<String> arrayListVersion = new ArrayList<>();
    private LinkedList<String> linkedListVersion = new LinkedList<>();

    void addVersion(String version) {
        versions.add(version);
        arrayListVersion.add(version);
        linkedListVersion.add(version);
        history.add(version);
    }

    void revertVersion(){
        if(!versions.isEmpty()){
            String lastVersion = history.pop();
            arrayListVersion.remove(lastVersion);
            linkedListVersion.remove(lastVersion);
            versions.remove(lastVersion);
        }
    }

    void listVersion(){
        System.out.println(versions);
        System.out.println(arrayListVersion);
        System.out.println(linkedListVersion);
    }

    public static void main(String[] args) {
        VersionControl versionControl = new VersionControl();
        versionControl.addVersion("1.0.0");
        versionControl.addVersion("2.0.0");

        versionControl.listVersion();

        versionControl.revertVersion();

        versionControl.listVersion();
    }
}
