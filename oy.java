/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.lo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Set;

public class oy
implements dav {
    public static final Set a = lo.b("minecraft", (Object)"realms");
    private final cfc b;

    public oy(cfc cfc2) {
        this.b = cfc2;
    }

    @Override
    public InputStream a(bpx bpx2) {
        InputStream inputStream = this.d(bpx2);
        if (inputStream != null) {
            return inputStream;
        }
        InputStream inputStream2 = this.c(bpx2);
        if (inputStream2 != null) {
            return inputStream2;
        }
        throw new FileNotFoundException(bpx2.b());
    }

    public InputStream c(bpx bpx2) {
        File file = this.b.a(bpx2);
        return file == null || !file.isFile() ? null : new FileInputStream(file);
    }

    private InputStream d(bpx bpx2) {
        return oy.class.getResourceAsStream("/assets/" + bpx2.c() + "/" + bpx2.b());
    }

    @Override
    public boolean b(bpx bpx2) {
        return this.d(bpx2) != null || this.b.b(bpx2);
    }

    @Override
    public Set c() {
        return a;
    }

    @Override
    public bzj a(a a2, String string) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.b.a());
            return gv.a(a2, fileInputStream, string);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    @Override
    public BufferedImage a() {
        return anq.a(oy.class.getResourceAsStream("/" + new bpx("pack.png").b()));
    }

    @Override
    public String b() {
        return "Default";
    }
}

