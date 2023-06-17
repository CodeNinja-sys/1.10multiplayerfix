/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedInputStream;
import java.nio.ByteBuffer;
import org.apache.commons.b.t;
import org.apache.commons.c.am;
import org.lwjgl.BufferUtils;

public class bvt {
    private final bov a;
    private final String b;
    private final int c;
    private int d;

    private bvt(bov bov2, int n2, String string) {
        this.a = bov2;
        this.c = n2;
        this.b = string;
    }

    public void a(afl afl2) {
        ++this.d;
        cjg.b(afl2.g(), this.c);
    }

    public void b(afl afl2) {
        --this.d;
        if (this.d <= 0) {
            cjg.a(this.c);
            bov.a(this.a).remove(this.b);
        }
    }

    public String a() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static bvt a(akx akx2, bov bov2, String string) {
        bvt bvt2 = (bvt)bov.a(bov2).get(string);
        if (bvt2 == null) {
            bpx bpx2 = new bpx("shaders/program/" + string + bov.b(bov2));
            dbr dbr2 = akx2.a(bpx2);
            try {
                byte[] arrby = t.c(new BufferedInputStream(dbr2.b()));
                ByteBuffer byteBuffer = BufferUtils.a(arrby.length);
                byteBuffer.put(arrby);
                byteBuffer.position(0);
                int n2 = cjg.b(bov.c(bov2));
                cjg.a(n2, byteBuffer);
                cjg.c(n2);
                if (cjg.c(n2, cjg.n) == 0) {
                    String string2 = am.a(cjg.d(n2, 32768));
                    csy csy2 = new csy("Couldn't compile " + bov2.a() + " program: " + string2);
                    csy2.b(bpx2.b());
                    throw csy2;
                }
                bvt2 = new bvt(bov2, n2, string);
                bov.a(bov2).put(string, bvt2);
            }
            finally {
                t.a(dbr2);
            }
        }
        return bvt2;
    }
}

