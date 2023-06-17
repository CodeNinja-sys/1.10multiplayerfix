/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.b.aa;
import com.a.b.ab;
import com.a.b.z;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public abstract class gv
implements dav {
    private static final d b = c.c();
    protected final File a;

    public gv(File file) {
        this.a = file;
    }

    private static String c(bpx bpx2) {
        return String.format("%s/%s/%s", "assets", bpx2.c(), bpx2.b());
    }

    protected static String a(File file, File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }

    @Override
    public InputStream a(bpx bpx2) {
        return this.a(gv.c(bpx2));
    }

    @Override
    public boolean b(bpx bpx2) {
        return this.b(gv.c(bpx2));
    }

    protected abstract InputStream a(String var1);

    protected abstract boolean b(String var1);

    protected void c(String string) {
        b.f("ResourcePack: ignored non-lowercase namespace: %s in %s", string, this.a);
    }

    @Override
    public bzj a(a a2, String string) {
        return gv.a(a2, this.a("pack.mcmeta"), string);
    }

    static bzj a(a a2, InputStream inputStream, String string) {
        z z2 = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, aj.c));
            z2 = new ab().a(bufferedReader).t();
        }
        catch (RuntimeException runtimeException) {
            try {
                throw new aa(runtimeException);
            }
            catch (Throwable throwable) {
                t.a(bufferedReader);
                throw throwable;
            }
        }
        t.a(bufferedReader);
        return a2.a(string, z2);
    }

    @Override
    public BufferedImage a() {
        return anq.a(this.a("pack.png"));
    }

    @Override
    public String b() {
        return this.a.getName();
    }
}

