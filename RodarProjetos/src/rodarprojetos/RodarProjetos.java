package rodarprojetos;

import java.util.Scanner;

// Importing Classes/Files
import java.io.*;
// Importing  specific File Class for directory access
import java.io.File;

public class RodarProjetos {
    
    static String ant;
    
    public static void main(String[] args) {
        //"C:\Program Files\NetBeans-23\netbeans\extide\ant\bin\ant"
        
        // Pedir ao usuário local do ant instalado
        // achar projetos nas pastas que o diretorio atual
        // compilar pojetos e copiar eus .jar para algum lugar
        // mostrar lista de jars
        // permitir que o usuário escolha um dos jars para ser executado
        File currentDir = new File(".");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite onde o Apache ANT está instalado?");
        ant = ler.nextLine();
        
        //System.out.println(ant);
        
        
        System.out.println("Procurando projetos ANT no diretório...");
        
        // Pegar o diretório atual e achar pastas que contem o arquivo build.xml como criança imediata
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));
        displayDirectory(currentDir);
    }
    
        // Function displaying all the directories
    // present in the directory
    public static void displayDirectory(File dir)
    {
        
        try {
            File[] files = dir.listFiles();

            // For-each loop for iteration
            for (File file : files) {

                // Checking of file inside directory
                if (file.isDirectory()) {
                    for (File filo : file.listFiles()) {
                        if (!filo.isDirectory() && "build.xml".equals(filo.getName())) {
                            System.out.println("Directory " + file.getCanonicalPath() + " has ant build.xml");
                            String [] cmds = new String [5];
                            cmds[0] = ant + "\\bin\\ant.bat";
                            cmds[1] = "-buildfile";
                            cmds[2] = filo.getCanonicalPath();
                            cmds[3] = "build.xml";
                            cmds[4] = "-Djar.output=" + dir.getCanonicalPath()+ "\\dist\\" + file.getName() + ".jar";
                            Process process = Runtime.getRuntime().exec(cmds);
                            
                            // Read the output
                            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                            String line;
                            while ((line = reader.readLine()) != null) {
                                System.out.println(line);
                            }
                        }
                    }
                }
            }
        }

        // if any exceptions occurs printStackTrace
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
