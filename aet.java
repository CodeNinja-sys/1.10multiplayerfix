/*
 * Decompiled with CFR 0.150.
 */
import a.a.a.a.b.as;
import a.a.a.a.b.bl;
import java.util.List;
import java.util.Random;

public abstract class aet
extends bci {
    private afv a;
    protected as b = new bl(1024);

    public abstract String a();

    @Override
    protected final synchronized void a(iu iu2, int n2, int n3, int n4, int n5, cnb cnb2) {
        this.a(iu2);
        if (this.b.b(zz.a(n2, n3))) {
            return;
        }
        this.d.nextInt();
        try {
            if (this.a(n2, n3)) {
                cv cv2 = this.b(n2, n3);
                this.b.a(zz.a(n2, n3), cv2);
                if (cv2.a()) {
                    this.a(n2, n3, cv2);
                }
            }
        }
        catch (Throwable throwable) {
            cet cet2 = cet.a(throwable, "Exception preparing structure feature");
            sx sx2 = cet2.a("Feature being prepared");
            sx2.a("Is feature chunk", new bhr(this, n2, n3));
            sx2.a("Chunk location", String.format("%d,%d", n2, n3));
            sx2.a("Chunk pos hash", new nw(this, n2, n3));
            sx2.a("Structure type", new blb(this));
            throw new oz(cet2);
        }
    }

    public synchronized boolean a(iu iu2, Random random, zz zz2) {
        this.a(iu2);
        int n2 = (zz2.a << 4) + 8;
        int n3 = (zz2.b << 4) + 8;
        boolean bl2 = false;
        for (cv cv2 : this.b.c()) {
            if (!cv2.a() || !cv2.a(zz2) || !cv2.b().a(n2, n3, n2 + 15, n3 + 15)) continue;
            cv2.a(iu2, random, new awx(n2, n3, n2 + 15, n3 + 15));
            cv2.b(zz2);
            bl2 = true;
            this.a(cv2.e(), cv2.f(), cv2);
        }
        return bl2;
    }

    public boolean a(cmz cmz2) {
        this.a(this.e);
        return this.b(cmz2) != null;
    }

    protected cv b(cmz cmz2) {
        for (cv cv2 : this.b.c()) {
            if (!cv2.a() || !cv2.b().a(cmz2)) continue;
            for (pc pc2 : cv2.c()) {
                if (!pc2.b().a(cmz2)) continue;
                return cv2;
            }
        }
        return null;
    }

    public boolean a(iu iu2, cmz cmz2) {
        this.a(iu2);
        for (cv cv2 : this.b.c()) {
            if (!cv2.a() || !cv2.b().a(cmz2)) continue;
            return true;
        }
        return false;
    }

    public cmz b(iu iu2, cmz cmz2) {
        Object object;
        cmz cmz3;
        double d2;
        this.e = iu2;
        this.a(iu2);
        this.d.setSeed(iu2.y());
        long l2 = this.d.nextLong();
        long l3 = this.d.nextLong();
        long l4 = (long)(cmz2.a() >> 4) * l2;
        long l5 = (long)(cmz2.c() >> 4) * l3;
        this.d.setSeed(l4 ^ l5 ^ iu2.y());
        this.a(iu2, cmz2.a() >> 4, cmz2.c() >> 4, 0, 0, null);
        double d3 = Double.MAX_VALUE;
        cmz cmz4 = null;
        for (Object object2 : this.b.c()) {
            if (!((cv)object2).a() || !((d2 = (cmz3 = ((pc)(object = (pc)((cv)object2).c().get(0))).d()).f(cmz2)) < d3)) continue;
            d3 = d2;
            cmz4 = cmz3;
        }
        if (cmz4 != null) {
            return cmz4;
        }
        List list = this.b();
        if (list != null) {
            Object object2;
            object2 = null;
            object = list.iterator();
            while (object.hasNext()) {
                cmz3 = (cmz)object.next();
                d2 = cmz3.f(cmz2);
                if (!(d2 < d3)) continue;
                d3 = d2;
                object2 = cmz3;
            }
            return object2;
        }
        return null;
    }

    protected List b() {
        return null;
    }

    protected void a(iu iu2) {
        if (this.a == null) {
            this.a = (afv)iu2.a(afv.class, this.a());
            if (this.a == null) {
                this.a = new afv(this.a());
                iu2.a(this.a(), this.a);
            } else {
                bvp bvp2 = this.a.c();
                for (String string : bvp2.b()) {
                    bvp bvp3;
                    azt azt2 = bvp2.c(string);
                    if (azt2.a() != 10 || !(bvp3 = (bvp)azt2).e("ChunkX") || !bvp3.e("ChunkZ")) continue;
                    int n2 = bvp3.h("ChunkX");
                    int n3 = bvp3.h("ChunkZ");
                    cv cv2 = mb.a(bvp3, iu2);
                    if (cv2 == null) continue;
                    this.b.a(zz.a(n2, n3), cv2);
                }
            }
        }
    }

    private void a(int n2, int n3, cv cv2) {
        this.a.a(cv2.a(n2, n3), n2, n3);
        this.a.a();
    }

    protected abstract boolean a(int var1, int var2);

    protected abstract cv b(int var1, int var2);
}

