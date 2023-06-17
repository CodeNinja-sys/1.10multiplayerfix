/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class coi
extends chb {
    private static final d g = org.apache.logging.log4j.c.c();
    protected final bpx f;

    public coi(bpx bpx2) {
        this.f = bpx2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(akx akx2) {
        this.e();
        dbr dbr2 = null;
        try {
            dbr2 = akx2.a(this.f);
            BufferedImage bufferedImage = anq.a(dbr2.b());
            boolean bl2 = false;
            boolean bl3 = false;
            if (dbr2.c()) {
                try {
                    crs crs2 = (crs)dbr2.a("texture");
                    if (crs2 != null) {
                        bl2 = crs2.a();
                        bl3 = crs2.b();
                    }
                }
                catch (RuntimeException runtimeException) {
                    g.f("Failed reading metadata of: {}", this.f, runtimeException);
                }
            }
            anq.a(this.aF_(), bufferedImage, bl2, bl3);
        }
        catch (Throwable throwable) {
            t.a(dbr2);
            throw throwable;
        }
        t.a(dbr2);
    }
}

