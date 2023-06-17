/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bjm
extends coi {
    private static final d g = org.apache.logging.log4j.c.c();
    private static final AtomicInteger h = new AtomicInteger(0);
    private final File i;
    private final String j;
    private final civ k;
    private BufferedImage l;
    private Thread m;
    private boolean n;

    public bjm(File file, String string, bpx bpx2, civ civ2) {
        super(bpx2);
        this.i = file;
        this.j = string;
        this.k = civ2;
    }

    private void f() {
        if (this.n) {
            return;
        }
        if (this.l != null) {
            if (this.f != null) {
                this.e();
            }
            anq.a(super.aF_(), this.l);
            this.n = true;
        }
    }

    @Override
    public int aF_() {
        this.f();
        return super.aF_();
    }

    public void a(BufferedImage bufferedImage) {
        this.l = bufferedImage;
        if (this.k != null) {
            this.k.a();
        }
    }

    @Override
    public void a(akx akx2) {
        if (this.l == null && this.f != null) {
            super.a(akx2);
        }
        if (this.m == null) {
            if (this.i != null && this.i.isFile()) {
                g.a("Loading http texture from local cache ({})", this.i);
                try {
                    this.l = ImageIO.read(this.i);
                    if (this.k != null) {
                        this.a(this.k.a(this.l));
                    }
                }
                catch (IOException iOException) {
                    g.b("Couldn't load skin {}", this.i, iOException);
                    this.b();
                }
            } else {
                this.b();
            }
        }
    }

    protected void b() {
        this.m = new ag(this, "Texture Downloader #" + h.incrementAndGet());
        this.m.setDaemon(true);
        this.m.start();
    }

    static /* synthetic */ String a(bjm bjm2) {
        return bjm2.j;
    }

    static /* synthetic */ File b(bjm bjm2) {
        return bjm2.i;
    }

    static /* synthetic */ d c() {
        return g;
    }

    static /* synthetic */ civ c(bjm bjm2) {
        return bjm2.k;
    }
}

