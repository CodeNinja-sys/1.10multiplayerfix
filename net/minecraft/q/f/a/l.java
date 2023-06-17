/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import com.a.a.d.ov;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.g;
import net.minecraft.e.e;
import net.minecraft.e.h;
import net.minecraft.q.a.d;
import net.minecraft.q.a.u;
import net.minecraft.q.ab;
import net.minecraft.q.b.i;
import net.minecraft.q.b.x;
import net.minecraft.q.f.a.a;
import net.minecraft.q.f.a.c;
import net.minecraft.q.f.a.f;
import net.minecraft.q.f.a.j;
import net.minecraft.q.f.a.k;
import net.minecraft.q.f.a.m;
import net.minecraft.u.as;
import org.apache.commons.c.am;

public class l
extends net.minecraft.q.a.k {
    private static final org.apache.logging.log4j.d c = org.apache.logging.log4j.c.c();

    public l(File file, net.minecraft.u.a.a a2) {
        super(file, a2);
    }

    @Override
    public String a() {
        return "Anvil";
    }

    @Override
    public List b() {
        if (this.a != null && this.a.exists() && this.a.isDirectory()) {
            File[] arrfile;
            ArrayList arrayList = ov.a();
            File[] arrfile2 = arrfile = this.a.listFiles();
            int n2 = arrfile.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string;
                d d2;
                File file = arrfile2[i2];
                if (!file.isDirectory() || (d2 = this.a(string = file.getName())) == null || d2.j() != 19132 && d2.j() != 19133) continue;
                boolean bl2 = d2.j() != this.d();
                String string2 = d2.i();
                if (am.a((CharSequence)string2)) {
                    string2 = string;
                }
                long l2 = 0L;
                arrayList.add(new net.minecraft.q.a.x(d2, string, string2, 0L, bl2));
            }
            return arrayList;
        }
        throw new g("Unable to read or access folder where game worlds are saved!");
    }

    protected int d() {
        return 19133;
    }

    @Override
    public void c() {
        f.a();
    }

    @Override
    public u a(String string, boolean bl2) {
        return new j(this.a, string, bl2, this.b);
    }

    @Override
    public boolean d(String string) {
        d d2 = this.a(string);
        return d2 != null && d2.j() == 19132;
    }

    @Override
    public boolean e(String string) {
        d d2 = this.a(string);
        return d2 != null && d2.j() != this.d();
    }

    @Override
    public boolean a(String string, as as2) {
        as2.a(0);
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a();
        ArrayList arrayList3 = ov.a();
        File file = new File(this.a, string);
        File file2 = new File(file, "DIM-1");
        File file3 = new File(file, "DIM1");
        c.d("Scanning folders...");
        this.a(file, arrayList);
        if (file2.exists()) {
            this.a(file2, arrayList2);
        }
        if (file3.exists()) {
            this.a(file3, arrayList3);
        }
        int n2 = arrayList.size() + arrayList2.size() + arrayList3.size();
        c.d("Total conversion count is {}", n2);
        d d2 = this.a(string);
        i i2 = d2.t() == ab.c ? new x(net.minecraft.a.i.c) : new i(d2);
        this.a(new File(file, "region"), arrayList, i2, 0, n2, as2);
        this.a(new File(file2, "region"), arrayList2, (i)new x(net.minecraft.a.i.j), arrayList.size(), n2, as2);
        this.a(new File(file3, "region"), arrayList3, (i)new x(net.minecraft.a.i.k), arrayList.size() + arrayList2.size(), n2, as2);
        d2.d(19133);
        if (d2.t() == ab.h) {
            d2.a(ab.b);
        }
        this.g(string);
        u u2 = this.a(string, false);
        u2.a(d2);
        return true;
    }

    private void g(String string) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            c.f("Unable to create level.dat_mcr backup");
        } else {
            File file2 = new File(file, "level.dat");
            if (!file2.exists()) {
                c.f("Unable to create level.dat_mcr backup");
            } else {
                File file3 = new File(file, "level.dat_mcr");
                if (!file2.renameTo(file3)) {
                    c.f("Unable to create level.dat_mcr backup");
                }
            }
        }
    }

    private void a(File file, Iterable iterable, i i2, int n2, int n3, as as2) {
        for (File file2 : iterable) {
            this.a(file, file2, i2, n2, n3, as2);
            int n4 = (int)Math.round(100.0 * (double)(++n2) / (double)n3);
            as2.a(n4);
        }
    }

    private void a(File file, File file2, i i2, int n2, int n3, as as2) {
        try {
            String string = file2.getName();
            c c2 = new c(file2);
            c c3 = new c(new File(file, String.valueOf(string.substring(0, string.length() - ".mcr".length())) + ".mca"));
            for (int i3 = 0; i3 < 32; ++i3) {
                int n4;
                for (n4 = 0; n4 < 32; ++n4) {
                    if (!c2.c(i3, n4) || c3.c(i3, n4)) continue;
                    DataInputStream dataInputStream = c2.a(i3, n4);
                    if (dataInputStream == null) {
                        c.f("Failed to fetch input stream");
                        continue;
                    }
                    e e2 = h.a(dataInputStream);
                    dataInputStream.close();
                    e e3 = e2.o("Level");
                    a a2 = m.a(e3);
                    e e4 = new e();
                    e e5 = new e();
                    e4.a("Level", e5);
                    m.a(a2, e5, i2);
                    DataOutputStream dataOutputStream = c3.b(i3, n4);
                    h.a(e4, (DataOutput)dataOutputStream);
                    dataOutputStream.close();
                }
                n4 = (int)Math.round(100.0 * (double)(n2 * 1024) / (double)(n3 * 1024));
                int n5 = (int)Math.round(100.0 * (double)((i3 + 1) * 32 + n2 * 1024) / (double)(n3 * 1024));
                if (n5 <= n4) continue;
                as2.a(n5);
            }
            c2.a();
            c3.a();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void a(File file, Collection collection) {
        File file2 = new File(file, "region");
        File[] arrfile = file2.listFiles(new k(this));
        if (arrfile != null) {
            Collections.addAll(collection, arrfile);
        }
    }
}

