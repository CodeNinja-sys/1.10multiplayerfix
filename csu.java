/*
 * Decompiled with CFR 0.150.
 */
import com.a.b.z;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class csu
extends bhk {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    protected final Date b;
    protected final String c;
    protected final Date d;
    protected final String e;

    public csu(Object object, Date date, String string, Date date2, String string2) {
        super(object);
        this.b = date == null ? new Date() : date;
        this.c = string == null ? "(Unknown)" : string;
        this.d = date2;
        this.e = string2 == null ? "Banned by an operator." : string2;
    }

    protected csu(Object object, z z2) {
        super(object, z2);
        Date date;
        Date date2;
        try {
            date2 = z2.b("created") ? a.parse(z2.c("created").d()) : new Date();
        }
        catch (ParseException parseException) {
            date2 = new Date();
        }
        this.b = date2;
        this.c = z2.b("source") ? z2.c("source").d() : "(Unknown)";
        try {
            date = z2.b("expires") ? a.parse(z2.c("expires").d()) : null;
        }
        catch (ParseException parseException) {
            date = null;
        }
        this.d = date;
        this.e = z2.b("reason") ? z2.c("reason").d() : "Banned by an operator.";
    }

    public Date c() {
        return this.d;
    }

    public String d() {
        return this.e;
    }

    @Override
    boolean b() {
        if (this.d == null) {
            return false;
        }
        return this.d.before(new Date());
    }

    @Override
    protected void a(z z2) {
        z2.a("created", a.format(this.b));
        z2.a("source", this.c);
        z2.a("expires", this.d == null ? "forever" : a.format(this.d));
        z2.a("reason", this.e);
    }
}

