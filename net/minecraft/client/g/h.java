/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.k;
import net.minecraft.client.g.a.p;
import net.minecraft.client.g.ag;
import net.minecraft.client.g.cq;
import net.minecraft.u.bp;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class h
extends k {
    private static final d h = org.apache.logging.log4j.c.c();
    private static final AtomicInteger i = new AtomicInteger(0);
    private final File j;
    private final String k;
    private final ag l;
    private BufferedImage m;
    private Thread n;
    private boolean o;

    public h(File file, String string, bp bp2, ag ag2) {
        super(bp2);
        this.j = file;
        this.k = string;
        this.l = ag2;
    }

    private void c() {
        if (!this.o && this.m != null) {
            if (this.b != null) {
                this.f();
            }
            p.a(super.e(), this.m);
            this.o = true;
        }
    }

    @Override
    public int e() {
        this.c();
        return super.e();
    }

    public void b(BufferedImage bufferedImage) {
        this.m = bufferedImage;
        if (this.l != null) {
            this.l.a();
        }
    }

    @Override
    public void a(s s2) {
        if (this.m == null && this.b != null) {
            super.a(s2);
        }
        if (this.n == null) {
            if (this.j != null && this.j.isFile()) {
                h.a("Loading http texture from local cache ({})", this.j);
                try {
                    this.m = ImageIO.read(this.j);
                    if (this.l != null) {
                        this.b(this.l.a(this.m));
                    }
                }
                catch (IOException iOException) {
                    h.b("Couldn't load skin {}", this.j, iOException);
                    this.a();
                }
            } else {
                this.a();
            }
        }
    }

    protected void a() {
        this.n = new cq(this, "Texture Downloader #" + i.incrementAndGet());
        this.n.setDaemon(true);
        this.n.start();
    }

    static /* synthetic */ d b() {
        return h;
    }

    static /* synthetic */ String a(h h2) {
        return h2.k;
    }

    static /* synthetic */ File b(h h2) {
        return h2.j;
    }

    static /* synthetic */ ag c(h h2) {
        return h2.l;
    }
}

