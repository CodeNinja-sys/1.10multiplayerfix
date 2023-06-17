/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.a.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import net.java.games.a.a.b;

public class c {
    static final boolean a = true;
    List b = new ArrayList();

    public c(File file) {
        this.a(file);
    }

    private void a(File file) {
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            throw new FileNotFoundException("Plugin directory " + file.getName() + " not found.");
        }
        for (int i2 = 0; i2 < arrfile.length; ++i2) {
            File file2 = arrfile[i2];
            if (file2.getName().endsWith(".jar")) {
                this.b(file2);
                continue;
            }
            if (!file2.isDirectory()) continue;
            this.a(file2);
        }
    }

    private void b(File file) {
        try {
            System.out.println("Scanning jar: " + file.getName());
            b b2 = new b(file);
            JarFile jarFile = new JarFile(file);
            Enumeration<JarEntry> enumeration = jarFile.entries();
            while (enumeration.hasMoreElements()) {
                JarEntry jarEntry = enumeration.nextElement();
                System.out.println("Examining file : " + jarEntry.getName());
                if (!jarEntry.getName().endsWith("Plugin.class")) continue;
                System.out.println("Found candidate class: " + jarEntry.getName());
                String string = jarEntry.getName();
                string = string.substring(0, string.length() - 6);
                Class<?> class_ = b2.loadClass(string = string.replace('/', '.'));
                if (!b2.a(class_)) continue;
                System.out.println("Adding class to plugins:" + class_.getName());
                this.b.add(class_);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Class[] a() {
        Class[] arrclass = new Class[this.b.size()];
        return this.b.toArray(arrclass);
    }

    public Class[] a(Class[] arrclass) {
        ArrayList<Class> arrayList = new ArrayList<Class>(this.b.size());
        HashSet<Class> hashSet = new HashSet<Class>();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            hashSet.add(arrclass[i2]);
        }
        Class[] arrclass2 = this.b.iterator();
        while (arrclass2.hasNext()) {
            Class class_ = (Class)arrclass2.next();
            if (!this.a(class_, hashSet)) continue;
            arrayList.add(class_);
        }
        arrclass2 = new Class[arrayList.size()];
        return arrayList.toArray(arrclass2);
    }

    private boolean a(Class class_, Set set) {
        int n2;
        if (class_ == null) {
            return false;
        }
        Class<?>[] arrclass = class_.getInterfaces();
        for (n2 = 0; n2 < arrclass.length; ++n2) {
            if (!set.contains(arrclass[n2])) continue;
            return true;
        }
        for (n2 = 0; n2 < arrclass.length; ++n2) {
            if (!this.a(arrclass[n2], set)) continue;
            return true;
        }
        return this.a(class_.getSuperclass(), set);
    }

    public Class[] b(Class[] arrclass) {
        ArrayList<Class> arrayList = new ArrayList<Class>(this.b.size());
        HashSet<Class> hashSet = new HashSet<Class>();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            hashSet.add(arrclass[i2]);
        }
        Class[] arrclass2 = this.b.iterator();
        while (arrclass2.hasNext()) {
            Class class_ = (Class)arrclass2.next();
            if (!this.b(class_, hashSet)) continue;
            arrayList.add(class_);
        }
        arrclass2 = new Class[arrayList.size()];
        return arrayList.toArray(arrclass2);
    }

    private boolean b(Class class_, Set set) {
        int n2;
        if (class_ == null) {
            return false;
        }
        Class<?>[] arrclass = class_.getInterfaces();
        for (n2 = 0; n2 < arrclass.length; ++n2) {
            if (!set.contains(arrclass[n2])) continue;
            set.remove(arrclass[n2]);
            if (set.size() != 0) continue;
            return true;
        }
        for (n2 = 0; n2 < arrclass.length; ++n2) {
            if (!this.b(arrclass[n2], set)) continue;
            return true;
        }
        return this.b(class_.getSuperclass(), set);
    }

    public Class[] a(Class class_) {
        ArrayList<Class> arrayList = new ArrayList<Class>(this.b.size());
        Class[] arrclass = this.b.iterator();
        while (arrclass.hasNext()) {
            Class class_2 = (Class)arrclass.next();
            if (!this.a(class_2, class_)) continue;
            arrayList.add(class_2);
        }
        arrclass = new Class[arrayList.size()];
        return arrayList.toArray(arrclass);
    }

    private boolean a(Class class_, Class class_2) {
        if (class_ == null) {
            return false;
        }
        if (class_ == class_2) {
            return true;
        }
        return this.a(class_.getSuperclass(), class_2);
    }
}

