package com.home.sprinkler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SprinklerImpl {

    public void runSprinkler() {
       /* ProcessBuilder processBuilder=new ProcessBuilder();
        processBuilder.command("/sprinkler.bat");

        ProcessBuilder builder = new ProcessBuilder();
        if (isWindows) {
            builder.command("cmd.exe", "/c", "dir");
        } else {
            builder.command("sh", "-c", "ls");
        }
        builder.directory(new File(System.getProperty("user.home")));
        Process process = builder.start();
        StreamGobbler streamGobbler =
                new StreamGobbler(process.getInputStream(), System.out::println);
        Executors.newSingleThreadExecutor().submit(streamGobbler);
        int exitCode = process.waitFor();
        assert exitCode == 0;*/
    }

    public void runBatchScript() {
        System.out.println("run batch");
        ProcessBuilder processBuilder = new ProcessBuilder("src/main/java/com/home/sprinkler/sprinkler.bat");
        //Process process = Runtime.getRuntime().exec(
        //            "cmd /c hello.bat", null, new File("C:\\Users\\mkyong\\"));

        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
            }

            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println(output);
                System.exit(0);
            } else {
                //abnormal...
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

