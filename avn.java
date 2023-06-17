/*
 * Decompiled with CFR 0.150.
 */
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.c.am;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class avn
extends yr {
    private static final d c = org.apache.logging.log4j.c.c();

    public avn(File file, cgy cgy2) {
        super(file, cgy2);
    }

    @Override
    public String a() {
        return "Anvil";
    }

    @Override
    public List b() {
        File[] arrfile;
        if (this.a == null || !this.a.exists() || !this.a.isDirectory()) {
            throw new vd("Unable to read or access folder where game worlds are saved!");
        }
        ArrayList arrayList = com.a.a.d.ov.a();
        for (File file : arrfile = this.a.listFiles()) {
            String string;
            cvn cvn2;
            if (!file.isDirectory() || (cvn2 = this.a(string = file.getName())) == null || cvn2.j() != 19132 && cvn2.j() != 19133) continue;
            boolean bl2 = cvn2.j() != this.d();
            String string2 = cvn2.i();
            if (am.a((CharSequence)string2)) {
                string2 = string;
            }
            long l2 = 0L;
            arrayList.add(new bwp(cvn2, string, string2, 0L, bl2));
        }
        return arrayList;
    }

    protected int d() {
        return 19133;
    }

    @Override
    public void c() {
        ov.a();
    }

    @Override
    public ajq a(String string, boolean bl2) {
        return new bzn(this.a, string, bl2, this.b);
    }

    @Override
    public boolean d(String string) {
        cvn cvn2 = this.a(string);
        return cvn2 != null && cvn2.j() == 19132;
    }

    @Override
    public boolean e(String string) {
        cvn cvn2 = this.a(string);
        return cvn2 != null && cvn2.j() != this.d();
    }

    @Override
    public boolean a(String string, wd wd2) {
        wd2.a(0);
        ArrayList arrayList = com.a.a.d.ov.a();
        ArrayList arrayList2 = com.a.a.d.ov.a();
        ArrayList arrayList3 = com.a.a.d.ov.a();
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
        cvn cvn2 = this.a(string);
        ey ey2 = cvn2.s() == aaf.c ? new cvi(cff.c) : new ey(cvn2);
        this.a(new File(file, "region"), arrayList, ey2, 0, n2, wd2);
        this.a(new File(file2, "region"), arrayList2, (ey)new cvi(cff.j), arrayList.size(), n2, wd2);
        this.a(new File(file3, "region"), arrayList3, (ey)new cvi(cff.k), arrayList.size() + arrayList2.size(), n2, wd2);
        cvn2.d(19133);
        if (cvn2.s() == aaf.h) {
            cvn2.a(aaf.b);
        }
        this.g(string);
        ajq ajq2 = this.a(string, false);
        ajq2.a(cvn2);
        return true;
    }

    private void g(String string) {
        File file = new File(this.a, string);
        if (!file.exists()) {
            c.f("Unable to create level.dat_mcr backup");
            return;
        }
        File file2 = new File(file, "level.dat");
        if (!file2.exists()) {
            c.f("Unable to create level.dat_mcr backup");
            return;
        }
        File file3 = new File(file, "level.dat_mcr");
        if (!file2.renameTo(file3)) {
            c.f("Unable to create level.dat_mcr backup");
        }
    }

    private void a(File file, Iterable iterable, ey ey2, int n2, int n3, wd wd2) {
        for (File file2 : iterable) {
            this.a(file, file2, ey2, n2, n3, wd2);
            int n4 = (int)Math.round(100.0 * (double)(++n2) / (double)n3);
            wd2.a(n4);
        }
    }

    private void a(File file, File file2, ey ey2, int n2, int n3, wd wd2) {
        try {
            String string = file2.getName();
            aig aig2 = new aig(file2);
            aig aig3 = new aig(new File(file, string.substring(0, string.length() - ".mcr".length()) + ".mca"));
            for (int i2 = 0; i2 < 32; ++i2) {
                int n4;
                for (n4 = 0; n4 < 32; ++n4) {
                    if (!aig2.c(i2, n4) || aig3.c(i2, n4)) continue;
                    DataInputStream dataInputStream = aig2.a(i2, n4);
                    if (dataInputStream == null) {
                        c.f("Failed to fetch input stream");
                        continue;
                    }
                    bvp bvp2 = cyb.a(dataInputStream);
                    dataInputStream.close();
                    bvp bvp3 = bvp2.o("Level");
                    dfi dfi2 = lx.a(bvp3);
                    bvp bvp4 = new bvp();
                    bvp bvp5 = new bvp();
                    bvp4.a("Level", bvp5);
                    lx.a(dfi2, bvp5, ey2);
                    DataOutputStream dataOutputStream = aig3.b(i2, n4);
                    cyb.a(bvp4, (DataOutput)dataOutputStream);
                    dataOutputStream.close();
                }
                n4 = (int)Math.round(100.0 * (double)(n2 * 1024) / (double)(n3 * 1024));
                int n5 = (int)Math.round(100.0 * (double)((i2 + 1) * 32 + n2 * 1024) / (double)(n3 * 1024));
                if (n5 <= n4) continue;
                wd2.a(n5);
            }
            aig2.a();
            aig3.a();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void a(File file, Collection collection) {
        File file2 = new File(file, "region");
        File[] arrfile = file2.listFiles(new cju(this));
        if (arrfile != null) {
            Collections.addAll(collection, arrfile);
        }
    }
}

