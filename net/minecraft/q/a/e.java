/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import net.minecraft.c.a;
import net.minecraft.q.a.d;
import net.minecraft.q.a.k;
import net.minecraft.q.a.m;
import net.minecraft.q.a.u;
import net.minecraft.q.aq;
import net.minecraft.q.f.a.h;
import net.minecraft.u.a.f;
import net.minecraft.w.a.b;
import org.apache.logging.log4j.c;

public class e
implements m,
u {
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private final File c;
    private final File d;
    private final File e;
    private final long f = net.minecraft.c.a.aI();
    private final String g;
    private final net.minecraft.q.g.c.a.e h;
    protected final net.minecraft.u.a.a a;

    public e(File file, String string, boolean bl2, net.minecraft.u.a.a a2) {
        this.a = a2;
        this.c = new File(file, string);
        this.c.mkdirs();
        this.d = new File(this.c, "playerdata");
        this.e = new File(this.c, "data");
        this.e.mkdirs();
        this.g = string;
        if (bl2) {
            this.d.mkdirs();
            this.h = new net.minecraft.q.g.c.a.e(new File(this.c, "structures").toString());
        } else {
            this.h = null;
        }
        this.h();
    }

    private void h() {
        try {
            File file = new File(this.c, "session.lock");
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
                dataOutputStream.writeLong(this.f);
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

    @Override
    public void b() {
        try {
            File file = new File(this.c, "session.lock");
            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
                if (dataInputStream.readLong() != this.f) {
                    throw new aq("The save is being accessed from another location, aborting");
                }
            }
        }
        catch (IOException iOException) {
            throw new aq("Failed to check session lock, aborting");
        }
    }

    @Override
    public h a(net.minecraft.q.e e2) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }

    @Override
    public d c() {
        d d2;
        File file = new File(this.c, "level.dat");
        if (file.exists() && (d2 = k.a(file, this.a)) != null) {
            return d2;
        }
        file = new File(this.c, "level.dat_old");
        return file.exists() ? k.a(file, this.a) : null;
    }

    @Override
    public void a(d d2, net.minecraft.e.e e2) {
        net.minecraft.e.e e3 = d2.a(e2);
        net.minecraft.e.e e4 = new net.minecraft.e.e();
        e4.a("Data", e3);
        try {
            File file = new File(this.c, "level.dat_new");
            File file2 = new File(this.c, "level.dat_old");
            File file3 = new File(this.c, "level.dat");
            net.minecraft.e.h.a(e4, new FileOutputStream(file));
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
    public void a(d d2) {
        this.a(d2, null);
    }

    @Override
    public void a(b b2) {
        try {
            net.minecraft.e.e e2 = b2.e(new net.minecraft.e.e());
            File file = new File(this.d, String.valueOf(b2.cN()) + ".dat.tmp");
            File file2 = new File(this.d, String.valueOf(b2.cN()) + ".dat");
            net.minecraft.e.h.a(e2, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception exception) {
            b.f("Failed to save player data for {}", b2.X());
        }
    }

    @Override
    public net.minecraft.e.e b(b b2) {
        net.minecraft.e.e e2 = null;
        try {
            File file = new File(this.d, String.valueOf(b2.cN()) + ".dat");
            if (file.exists() && file.isFile()) {
                e2 = net.minecraft.e.h.a(new FileInputStream(file));
            }
        }
        catch (Exception exception) {
            b.f("Failed to load player data for {}", b2.X());
        }
        if (e2 != null) {
            b2.f(this.a.a((f)net.minecraft.u.a.c.b, e2));
        }
        return e2;
    }

    @Override
    public m d() {
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
        return new File(this.e, String.valueOf(string) + ".dat");
    }

    @Override
    public net.minecraft.q.g.c.a.e g() {
        return this.h;
    }
}

