import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApps {
    public static void main(String[] args) throws Exception {
        Person person = readInputUser();
        MahasiswaModel model  = new MahasiswaModel();

        model.setName(person.getName());
        model.setNpm(person.getNpm());


        Mahasiswa.konversi(model.getNpm(), model);

        System.out.println(model.toString());

    }
    private static Person readInputUser() {
        String npm = readNPM();
        if (!Mahasiswa.isNpmValid(npm)) {
            return readInputUser();
        }
        String name = readName();
        return new Person(name, npm);
    }
    private static Person parseArgument (String[] args) throws  Exception {
        List<String> argsList = Arrays.asList(args);
        int indexNpm = argsList.indexOf("--npm");
        int indexName = argsList.indexOf("--name");
        String npm = "", name = "";

        System.out.println("Index NPM: " + indexNpm);
        int index = 0;
        for (String arg : args) {
            if (arg.startsWith("--npm")) {
                npm = args[index + 1];
                if (npm.startsWith("--")) {
                    npm = readNPM();
                }
            } else if (arg.startsWith("--name")) {
                name = args[index + 1];
                if (name.startsWith("--")) {
                    name = readName();
                }
            }
            index++;
        }
        indexNpm = (indexNpm > -1) ? (indexNpm + 1) : -1;
        indexName = (indexName > -1) ? (indexName + 1) : -1;
        System.out.println("Index NPM: " + indexNpm);

        if (indexNpm >- 1) {
            try {
                npm = argsList.get(indexNpm);
                if (npm.startsWith("--")) {
                    npm = readNPM();
                }
            } catch (Exception e) {
                System.out.println("Error Masuk");
                npm = readNPM();
            }
        } else {
            System.out.println("Error Masuk 2");
            npm = readNPM();
        }

        if (indexName > -1) {
            try {
                name = argsList.get(indexName);
                if (name.startsWith("--")) {
                    name = readName();
                }
            } catch (Exception e) {
                name = readName();
            }
        } else {
            name = readName();
        }



        if (!(indexNpm > argsList.size()) &&  npm.startsWith("--")) {
            npm = readNPM();
        }
        if (!(indexName > argsList.size()) && name.startsWith("--")) {
            name = readName();
        }

        System.out.println("NPM : " + npm);
        System.out.println("Name : " + name);

        return new Person(npm, name);
    }
    private static String readNPM () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NPM : ");
        return scanner.nextLine();
    }
    private static String readName () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa : ");
        return scanner.nextLine();
    }
}
