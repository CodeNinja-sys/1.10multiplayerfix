/*
 * Decompiled with CFR 0.150.
 */
package b.b;

import b.af;
import b.ag;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a
implements ag {
    private final DateFormat a;

    public a(DateFormat dateFormat) {
        if (dateFormat == null) {
            throw new NullPointerException("illegal null formatter");
        }
        this.a = dateFormat;
    }

    public static a b(String string) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string);
        simpleDateFormat.setLenient(false);
        return new a(simpleDateFormat);
    }

    public Date c(String string) {
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = this.a.parse(string, parsePosition);
        if (parsePosition.getIndex() != string.length()) {
            throw new af(this.d(string));
        }
        return date;
    }

    public Class a() {
        return Date.class;
    }

    public String b() {
        return this.a instanceof SimpleDateFormat ? ((SimpleDateFormat)this.a).toPattern() : "";
    }

    private String d(String string) {
        String string2 = "Value [" + string + "] does not match date/time pattern";
        if (this.a instanceof SimpleDateFormat) {
            string2 = string2 + " [" + ((SimpleDateFormat)this.a).toPattern() + ']';
        }
        return string2;
    }

    public /* synthetic */ Object a(String string) {
        return this.c(string);
    }
}

