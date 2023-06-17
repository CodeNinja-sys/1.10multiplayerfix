/*
 * Decompiled with CFR 0.150.
 */
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.apache.commons.b.t;

public class cdg {
    private final dav b;
    private cqx c;
    private bpx d;
    final /* synthetic */ hh a;

    private cdg(hh hh2, File file) {
        this(hh2, file.isDirectory() ? new bch(file) : new alm(file));
    }

    private cdg(hh hh2, dav dav2) {
        this.a = hh2;
        this.b = dav2;
    }

    public void a() {
        this.c = (cqx)this.b.a(this.a.b, "pack");
        this.b();
    }

    public void a(bnm bnm2) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = this.b.a();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (bufferedImage == null) {
            try {
                bufferedImage = this.a.a.a();
            }
            catch (IOException iOException) {
                throw new Error("Couldn't bind resource pack icon", iOException);
            }
        }
        if (this.d == null) {
            this.d = bnm2.a("texturepackicon", new cze(bufferedImage));
        }
        bnm2.a(this.d);
    }

    public void b() {
        if (this.b instanceof Closeable) {
            t.a((Closeable)((Object)this.b));
        }
    }

    public dav c() {
        return this.b;
    }

    public String d() {
        return this.b.b();
    }

    public String e() {
        return this.c == null ? (Object)((Object)aug.m) + "Invalid pack.mcmeta (or missing 'pack' section)" : this.c.a().j();
    }

    public int f() {
        return this.c == null ? 0 : this.c.b();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof cdg) {
            return this.toString().equals(object.toString());
        }
        return false;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return String.format("%s:%s", this.b.b(), this.b instanceof bch ? "folder" : "zip");
    }

    /* synthetic */ cdg(hh hh2, File file, bdc bdc2) {
        this(hh2, file);
    }

    /* synthetic */ cdg(hh hh2, dav dav2, bdc bdc2) {
        this(hh2, dav2);
    }
}

