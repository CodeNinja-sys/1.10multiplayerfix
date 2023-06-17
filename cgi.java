/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;

public abstract class cgi
implements bvs {
    private final Class a;
    private final String b;

    protected cgi(String string, Class class_) {
        this.a = class_;
        this.b = string;
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public Class c() {
        return this.a;
    }

    public String toString() {
        return cc.a((Object)this).a("name", this.b).a("clazz", this.a).a("values", this.a()).toString();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof cgi) {
            cgi cgi2 = (cgi)object;
            return this.a.equals(cgi2.a) && this.b.equals(cgi2.b);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }
}

