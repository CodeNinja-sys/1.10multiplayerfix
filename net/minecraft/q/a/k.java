/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import com.a.a.d.ov;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.e.h;
import net.minecraft.q.a.d;
import net.minecraft.q.a.e;
import net.minecraft.q.a.u;
import net.minecraft.q.a.w;
import net.minecraft.q.a.x;
import net.minecraft.u.a.a;
import net.minecraft.u.a.f;
import net.minecraft.u.as;
import org.apache.logging.log4j.c;

public class k
implements w {
    private static final org.apache.logging.log4j.d c = org.apache.logging.log4j.c.c();
    protected final File a;
    protected final a b;

    public k(File file, a a2) {
        this.b = a2;
        if (!file.exists()) {
            file.mkdirs();
        }
        this.a = file;
    }

    @Override
    public String a() {
        return "Old Format";
    }

    @Override
    public List b() {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < 5; ++i2) {
            String string = "World" + (i2 + 1);
            d d2 = this.a(string);
            if (d2 == null) continue;
            arrayList.add(new x(d2, string, "", d2.g(), false));
        }
        return arrayList;
    }

    @Override
    public void c() {
    }

    @Override
    public d a(String string) {
        d d2;
        File file = new File(this.a, string);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists() && (d2 = k.a(file2, this.b)) != null) {
            return d2;
        }
        file2 = new File(file, "level.dat_old");
        return file2.exists() ? k.a(file2, this.b) : null;
    }

    public static d a(File file, a a2) {
        try {
            net.minecraft.e.e e2 = h.a(new FileInputStream(file));
            net.minecraft.e.e e3 = e2.o("Data");
            return new d(a2.a((f)net.minecraft.u.a.c.a, e3));
        }
        catch (Exception exception) {
            c.b("Exception reading {}", file, exception);
            return null;
        }
    }

    @Override
    public void a(String string, String string2) {
        File file;
        File file2 = new File(this.a, string);
        if (file2.exists() && (file = new File(file2, "level.dat")).exists()) {
            try {
                net.minecraft.e.e e2 = h.a(new FileInputStream(file));
                net.minecraft.e.e e3 = e2.o("Data");
                e3.a("LevelName", string2);
                h.a(e2, new FileOutputStream(file));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    @Override
    public boolean b(String string) {
        File file = new File(this.a, string);
        if (file.exists()) {
            return false;
        }
        try {
            file.mkdir();
            file.delete();
            return true;
        }
        catch (Throwable throwable) {
            c.f("Couldn't make new level", throwable);
            return false;
        }
    }

    @Override
    public boolean c(String string) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            return true;
        }
        c.d("Deleting level {}", string);
        for (int i2 = 1; i2 <= 5; ++i2) {
            c.d("Attempt {}...", i2);
            if (k.a(file.listFiles())) break;
            c.f("Unsuccessful in deleting contents.");
            if (i2 >= 5) continue;
            try {
                Thread.sleep(500L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return file.delete();
    }

    protected static boolean a(File[] arrfile) {
        File[] arrfile2 = arrfile;
        int n2 = arrfile.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            File file = arrfile2[i2];
            c.a("Deleting {}", file);
            if (file.isDirectory() && !k.a(file.listFiles())) {
                c.f("Couldn't delete directory {}", file);
                return false;
            }
            if (file.delete()) continue;
            c.f("Couldn't delete file {}", file);
            return false;
        }
        return true;
    }

    @Override
    public u a(String string, boolean bl2) {
        return new e(this.a, string, bl2, this.b);
    }

    @Override
    public boolean d(String string) {
        return false;
    }

    @Override
    public boolean e(String string) {
        return false;
    }

    @Override
    public boolean a(String string, as as2) {
        return false;
    }

    @Override
    public boolean f(String string) {
        File file = new File(this.a, string);
        return file.isDirectory();
    }

    @Override
    public File b(String string, String string2) {
        return new File(new File(this.a, string), string2);
    }
}

