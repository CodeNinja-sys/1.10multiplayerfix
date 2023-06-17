/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class cxu
extends bfa {
    public static final ddi a = ddi.b("wet");

    protected cxu() {
        super(ahk.m);
        this.D(this.O.b().a(a, Boolean.valueOf(false)));
        this.a(zm.b);
    }

    @Override
    public String az_() {
        return caf.a(this.n() + ".dry.name");
    }

    @Override
    public int d(dbk dbk2) {
        return (Boolean)dbk2.b(a) != false ? 1 : 0;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        this.e(iu2, cmz2, dbk2);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        this.e(iu2, cmz2, dbk2);
        super.a(dbk2, iu2, cmz2, bfa2);
    }

    protected void e(iu iu2, cmz cmz2, dbk dbk2) {
        if (!((Boolean)dbk2.b(a)).booleanValue() && this.c(iu2, cmz2)) {
            iu2.a(cmz2, dbk2.a(a, Boolean.valueOf(true)), 2);
            iu2.b(2001, cmz2, bfa.c(blg.j));
        }
    }

    private boolean c(iu iu2, cmz cmz2) {
        LinkedList linkedList = ov.b();
        ArrayList arrayList = ov.a();
        linkedList.add(new cam(cmz2, 0));
        int n2 = 0;
        while (!linkedList.isEmpty()) {
            cam cam2 = (cam)linkedList.poll();
            cmz cmz3 = (cmz)cam2.a();
            int n3 = (Integer)cam2.b();
            for (bqk bqk2 : bqk.values()) {
                cmz cmz4 = cmz3.c(bqk2);
                if (iu2.n(cmz4).a() != ahk.h) continue;
                iu2.a(cmz4, blg.a.s(), 2);
                arrayList.add(cmz4);
                ++n2;
                if (n3 >= 6) continue;
                linkedList.add(new cam(cmz4, n3 + 1));
            }
            if (n2 <= 64) continue;
            break;
        }
        for (cmz cmz3 : arrayList) {
            iu2.b(cmz3, blg.a);
        }
        return n2 > 0;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2, 1, 0));
        list.add(new bhl(azg2, 1, 1));
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Boolean.valueOf((n2 & 1) == 1));
    }

    @Override
    public int e(dbk dbk2) {
        return (Boolean)dbk2.b(a) != false ? 1 : 0;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        if (!((Boolean)dbk2.b(a)).booleanValue()) {
            return;
        }
        bqk bqk2 = bqk.a(random);
        if (bqk2 == bqk.b || iu2.n(cmz2.c(bqk2)).q()) {
            return;
        }
        double d2 = cmz2.a();
        double d3 = cmz2.b();
        double d4 = cmz2.c();
        if (bqk2 == bqk.a) {
            d3 -= 0.05;
            d2 += random.nextDouble();
            d4 += random.nextDouble();
        } else {
            d3 += random.nextDouble() * 0.8;
            if (bqk2.l() == ctv.a) {
                d4 += random.nextDouble();
                d2 = bqk2 == bqk.f ? (d2 += 1.1) : (d2 += 0.05);
            } else {
                d2 += random.nextDouble();
                d4 = bqk2 == bqk.d ? (d4 += 1.1) : (d4 += 0.05);
            }
        }
        iu2.a(lz.s, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
    }
}

