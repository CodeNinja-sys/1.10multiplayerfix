/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.nj;
import com.a.a.d.ov;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class du
extends bwr {
    private final String d;
    private final Object[] e;
    private final Object f = new Object();
    private long g = -1L;
    List a = ov.a();
    public static final Pattern b = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");

    public du(String string, Object ... arrobject) {
        this.d = string;
        this.e = arrobject;
        for (Object object : arrobject) {
            if (!(object instanceof cbg)) continue;
            ((cbg)object).h().a(this.h());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized void a() {
        Object object = this.f;
        synchronized (object) {
            long l2 = caf.a();
            if (l2 == this.g) {
                return;
            }
            this.g = l2;
            this.a.clear();
        }
        try {
            this.a(caf.a(this.d));
        }
        catch (abk abk2) {
            this.a.clear();
            try {
                this.a(caf.b(this.d));
            }
            catch (abk abk3) {
                throw abk2;
            }
        }
    }

    protected void a(String string) {
        boolean bl2 = false;
        Matcher matcher = b.matcher(string);
        int n2 = 0;
        int n3 = 0;
        try {
            while (matcher.find(n3)) {
                Object object;
                Object object2;
                int n4 = matcher.start();
                int n5 = matcher.end();
                if (n4 > n3) {
                    object2 = new aym(String.format(string.substring(n3, n4), new Object[0]));
                    ((bwr)object2).h().a(this.h());
                    this.a.add(object2);
                }
                object2 = matcher.group(2);
                String string2 = string.substring(n4, n5);
                if ("%".equals(object2) && "%%".equals(string2)) {
                    object = new aym("%");
                    ((bwr)object).h().a(this.h());
                    this.a.add(object);
                } else if ("s".equals(object2)) {
                    int n6;
                    object = matcher.group(1);
                    int n7 = n6 = object != null ? Integer.parseInt((String)object) - 1 : n2++;
                    if (n6 < this.e.length) {
                        this.a.add(this.a(n6));
                    }
                } else {
                    throw new abk(this, "Unsupported format: '" + string2 + "'");
                }
                n3 = n5;
            }
            if (n3 < string.length()) {
                aym aym2 = new aym(String.format(string.substring(n3), new Object[0]));
                aym2.h().a(this.h());
                this.a.add(aym2);
            }
        }
        catch (IllegalFormatException illegalFormatException) {
            throw new abk(this, (Throwable)illegalFormatException);
        }
    }

    private cbg a(int n2) {
        cbg cbg2;
        if (n2 >= this.e.length) {
            throw new abk(this, n2);
        }
        Object object = this.e[n2];
        if (object instanceof cbg) {
            cbg2 = (cbg)object;
        } else {
            cbg2 = new aym(object == null ? "null" : object.toString());
            cbg2.h().a(this.h());
        }
        return cbg2;
    }

    @Override
    public cbg a(bcc bcc2) {
        super.a(bcc2);
        for (Object object : this.e) {
            if (!(object instanceof cbg)) continue;
            ((cbg)object).h().a(this.h());
        }
        if (this.g > -1L) {
            for (cbg cbg2 : this.a) {
                cbg2.h().a(bcc2);
            }
        }
        return this;
    }

    @Override
    public Iterator iterator() {
        this.a();
        return nj.b(du.a(this.a), du.a(this.c));
    }

    @Override
    public String b() {
        this.a();
        StringBuilder stringBuilder = new StringBuilder();
        for (cbg cbg2 : this.a) {
            stringBuilder.append(cbg2.b());
        }
        return stringBuilder.toString();
    }

    public du c() {
        Object[] arrobject = new Object[this.e.length];
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            arrobject[i2] = this.e[i2] instanceof cbg ? ((cbg)this.e[i2]).f() : this.e[i2];
        }
        du du2 = new du(this.d, arrobject);
        du2.a(this.h().l());
        for (cbg cbg2 : this.g()) {
            du2.a(cbg2.f());
        }
        return du2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof du) {
            du du2 = (du)object;
            return Arrays.equals(this.e, du2.e) && this.d.equals(du2.d) && super.equals(object);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + Arrays.hashCode(this.e);
        return n2;
    }

    @Override
    public String toString() {
        return "TranslatableComponent{key='" + this.d + '\'' + ", args=" + Arrays.toString(this.e) + ", siblings=" + this.c + ", style=" + this.h() + '}';
    }

    public String d() {
        return this.d;
    }

    public Object[] e() {
        return this.e;
    }

    @Override
    public /* synthetic */ cbg f() {
        return this.c();
    }
}

