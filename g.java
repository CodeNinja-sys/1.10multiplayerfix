/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import net.minecraft.c.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class g
implements ajq,
aut {
    private static final d b = org.apache.logging.log4j.c.c();
    private final File c;
    private final File d;
    private final File e;
    private final long f = net.minecraft.c.a.av();
    private final String g;
    private final bzz h;
    protected final cgy a;

    public g(File file, String string, boolean bl2, cgy cgy2) {
        this.a = cgy2;
        this.c = new File(file, string);
        this.c.mkdirs();
        this.d = new File(this.c, "playerdata");
        this.e = new File(this.c, "data");
        this.e.mkdirs();
        this.g = string;
        if (bl2) {
            this.d.mkdirs();
            this.h = new bzz(new File(this.c, "structures").toString());
        } else {
            this.h = null;
        }
        this.h();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void h() {
        try {
            File file = new File(this.c, "session.lock");
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeLong(this.f);
            }
            finally {
                dataOutputStream.close();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }

    @Override
    public File a() {
        return this.c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b() {
        try {
            File file = new File(this.c, "session.lock");
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                if (dataInputStream.readLong() != this.f) {
                    throw new cb("The save is being accessed from another location, aborting");
                }
            }
            finally {
                dataInputStream.close();
            }
        }
        catch (IOException iOException) {
            throw new cb("Failed to check session lock, aborting");
        }
    }

    @Override
    public dab a(byf byf2) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }

    @Override
    public cvn c() {
        cvn cvn2;
        File file = new File(this.c, "level.dat");
        if (file.exists() && (cvn2 = yr.a(file, this.a)) != null) {
            return cvn2;
        }
        file = new File(this.c, "level.dat_old");
        if (file.exists()) {
            return yr.a(file, this.a);
        }
        return null;
    }

    @Override
    public void a(cvn cvn2, bvp bvp2) {
        bvp bvp3 = cvn2.a(bvp2);
        bvp bvp4 = new bvp();
        bvp4.a("Data", bvp3);
        try {
            File file = new File(this.c, "level.dat_new");
            File file2 = new File(this.c, "level.dat_old");
            File file3 = new File(this.c, "level.dat");
            cyb.a(bvp4, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void a(cvn cvn2) {
        this.a(cvn2, null);
    }

    @Override
    public void a(bdl bdl2) {
        try {
            bvp bvp2 = bdl2.e(new bvp());
            File file = new File(this.d, bdl2.cy() + ".dat.tmp");
            File file2 = new File(this.d, bdl2.cy() + ".dat");
            cyb.a(bvp2, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception exception) {
            b.f("Failed to save player data for {}", bdl2.i_());
        }
    }

    @Override
    public bvp b(bdl bdl2) {
        bvp bvp2 = null;
        try {
            File file = new File(this.d, bdl2.cy() + ".dat");
            if (file.exists() && file.isFile()) {
                bvp2 = cyb.a(new FileInputStream(file));
            }
        }
        catch (Exception exception) {
            b.f("Failed to load player data for {}", bdl2.i_());
        }
        if (bvp2 != null) {
            bdl2.f(this.a.a((bsl)bst.b, bvp2));
        }
        return bvp2;
    }

    @Override
    public aut d() {
        return this;
    }

    @Override
    public String[] e() {
        String[] arrstring = this.d.list();
        if (arrstring == null) {
            arrstring = new String[]{};
        }
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!arrstring[i2].endsWith(".dat")) continue;
            arrstring[i2] = arrstring[i2].substring(0, arrstring[i2].length() - 4);
        }
        return arrstring;
    }

    @Override
    public void f() {
    }

    @Override
    public File a(String string) {
        return new File(this.e, string + ".dat");
    }

    @Override
    public bzz g() {
        return this.h;
    }
}

