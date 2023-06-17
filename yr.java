/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class yr
implements bxj {
    private static final d c = org.apache.logging.log4j.c.c();
    protected final File a;
    protected final cgy b;

    public yr(File file, cgy cgy2) {
        this.b = cgy2;
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
            cvn cvn2 = this.a(string);
            if (cvn2 == null) continue;
            arrayList.add(new bwp(cvn2, string, "", cvn2.g(), false));
        }
        return arrayList;
    }

    @Override
    public void c() {
    }

    @Override
    public cvn a(String string) {
        cvn cvn2;
        File file = new File(this.a, string);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists() && (cvn2 = yr.a(file2, this.b)) != null) {
            return cvn2;
        }
        file2 = new File(file, "level.dat_old");
        if (file2.exists()) {
            return yr.a(file2, this.b);
        }
        return null;
    }

    public static cvn a(File file, cgy cgy2) {
        try {
            bvp bvp2 = cyb.a(new FileInputStream(file));
            bvp bvp3 = bvp2.o("Data");
            return new cvn(cgy2.a((bsl)bst.a, bvp3));
        }
        catch (Exception exception) {
            c.b("Exception reading {}", file, exception);
            return null;
        }
    }

    @Override
    public void a(String string, String string2) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            return;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                bvp bvp2 = cyb.a(new FileInputStream(file2));
                bvp bvp3 = bvp2.o("Data");
                bvp3.a("LevelName", string2);
                cyb.a(bvp2, new FileOutputStream(file2));
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
        }
        catch (Throwable throwable) {
            c.f("Couldn't make new level", throwable);
            return false;
        }
        return true;
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
            if (yr.a(file.listFiles())) break;
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
        for (File file : arrfile) {
            c.a("Deleting {}", file);
            if (file.isDirectory() && !yr.a(file.listFiles())) {
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
    public ajq a(String string, boolean bl2) {
        return new g(this.a, string, bl2, this.b);
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
    public boolean a(String string, wd wd2) {
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

