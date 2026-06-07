package br.csi.padroes_revisao.exercicio6;

import br.csi.padroes_revisao.REVISAO.exercicio2.infra.Conta;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class ReflectionMain {
    public static void main(String[] args) {
            /*JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.showOpenDialog(null);
        if (chooser.getSelectedFile() != null) {
            File jarFile = chooser.getSelectedFile();
            JarFile jar = new JarFile(jarFile);
            Enumeration<JarEntry> entries = jar.entries();
            URLClassLoader childCL = new URLClassLoader(new URL[]{ jarFile.toURL() }, BancoReflection.class.getClassLoader());
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                if (entry.getName().endsWith(".class") &&  entry.getName().startsWith("BOOT-INF/classes/")) {
                    String className = entry.getName().replace(".class", "");
                    className = className.replace("BOOT-INF/classes/", "").replaceAll("/", ".");
                    Class<?> clazz = Class.forName(className, true, childCL);
                }
            }
        }*/
        printClass(Conta.class);
    }

    private static void printClass(Class classe) {

        //vai imprimir o tipo de cada campo da classe
        for(Field f : classe.getDeclaredFields()) {
            int m = f.getModifiers();

            String abs = Modifier.isAbstract(m) ? "abstract" : "";
            String pub = Modifier.isPublic(m) ? "public" : "";
            String priv = Modifier.isPrivate(m) ? "private" : "";
            String fin = Modifier.isFinal(m) ? "final" : "";
            String sta = Modifier.isStatic(m) ? "static" : "";
            String mod = abs + pub + priv + fin + sta;

            System.out.println(mod + f.getType().getName() + " " + f.getName()+ ";");
        }

        System.out.println("\n");

        //percorrer cada metodo da classe
        for(Method method : classe.getDeclaredMethods()) {
            int m = method.getModifiers();

            String abs = Modifier.isAbstract(m) ? "abstract " : "";
            String pub = Modifier.isPublic(m) ? "public" : "";
            String priv = Modifier.isPrivate(m) ? "private" : "";
            String fin = Modifier.isFinal(m) ? "final" : "";
            String sta = Modifier.isStatic(m) ? "static" : "";
            String mod = abs + pub + priv + fin + sta;
            String params = "";

            //pego o nome do tipo do parametro + o nome do parametro
            for (Parameter param : method.getParameters()) {
                params += param.getType().getName() + " " + param.getName() + ", ";
            }

            if (params.length() > 0) {
                params = params.substring(0, params.length() - 2);
            }

            System.out.println("[" +mod + "]"+ method.getReturnType().getName() + " " + method.getName() + "(" + params + ");");

        }
    }





}
