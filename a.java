/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.k;
import com.a.b.r;
import com.a.b.w;
import com.a.b.z;
import java.lang.reflect.Type;

public class a {
    private final avt a = new dai();
    private final r b = new r();
    private k c;

    public a() {
        this.b.a(cbg.class, (Object)new zf());
        this.b.a(bcc.class, (Object)new kf());
        this.b.a(new ddq());
    }

    public void a(brv brv2, Class class_) {
        this.a.a(brv2.a(), new bsy(this, brv2, class_, null));
        this.b.a((Type)class_, (Object)brv2);
        this.c = null;
    }

    public bzj a(String string, z z2) {
        if (string == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!z2.b(string)) {
            return null;
        }
        if (!z2.c(string).q()) {
            throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + z2.c(string));
        }
        bsy bsy2 = (bsy)this.a.c(string);
        if (bsy2 == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
        }
        return (bzj)this.a().a((w)z2.f(string), (Type)bsy2.b);
    }

    private k a() {
        if (this.c == null) {
            this.c = this.b.i();
        }
        return this.c;
    }
}

