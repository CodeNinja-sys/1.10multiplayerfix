/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.c.aa;
import org.apache.commons.c.ao;
import org.apache.commons.c.h.c;
import org.apache.commons.c.h.k;

public class b
extends MessageFormat {
    private static final long a = -2362048321261811743L;
    private static final int b = 31;
    private static final String c = "";
    private static final String d = "''";
    private static final char e = ',';
    private static final char f = '}';
    private static final char g = '{';
    private static final char h = '\'';
    private String i;
    private final Map j;

    public b(String string) {
        this(string, Locale.getDefault());
    }

    public b(String string, Locale locale) {
        this(string, locale, null);
    }

    public b(String string, Map map) {
        this(string, Locale.getDefault(), map);
    }

    public b(String string, Locale locale, Map map) {
        super(c);
        this.setLocale(locale);
        this.j = map;
        this.applyPattern(string);
    }

    @Override
    public String toPattern() {
        return this.i;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final void applyPattern(String string) {
        int n2;
        if (this.j == null) {
            super.applyPattern(string);
            this.i = super.toPattern();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder stringBuilder = new StringBuilder(string.length());
        ParsePosition parsePosition = new ParsePosition(0);
        char[] arrc = string.toCharArray();
        int n3 = 0;
        block4: while (parsePosition.getIndex() < string.length()) {
            switch (arrc[parsePosition.getIndex()]) {
                case '\'': {
                    this.a(string, parsePosition, stringBuilder, true);
                    continue block4;
                }
                case '{': {
                    void object2;
                    String string2;
                    ++n3;
                    this.c(string, parsePosition);
                    int n4 = parsePosition.getIndex();
                    n2 = this.a(string, this.a(parsePosition));
                    stringBuilder.append('{').append(n2);
                    this.c(string, parsePosition);
                    Object object = null;
                    Object var11_13 = null;
                    if (arrc[parsePosition.getIndex()] == ',' && (object = this.a(string2 = this.b(string, this.a(parsePosition)))) == null) {
                        stringBuilder.append(',').append(string2);
                    }
                    arrayList.add(object);
                    arrayList2.add(object == null ? null : object2);
                    ao.a(arrayList.size() == n3);
                    ao.a(arrayList2.size() == n3);
                    if (arrc[parsePosition.getIndex()] == '}') break;
                    throw new IllegalArgumentException("Unreadable format element at position " + n4);
                }
            }
            stringBuilder.append(arrc[parsePosition.getIndex()]);
            this.a(parsePosition);
        }
        super.applyPattern(stringBuilder.toString());
        this.i = this.a(super.toPattern(), arrayList2);
        if (this.a(arrayList)) {
            Format[] arrformat = this.getFormats();
            n2 = 0;
            for (Format format : arrayList) {
                if (format != null) {
                    arrformat[n2] = format;
                }
                ++n2;
            }
            super.setFormats(arrformat);
        }
    }

    @Override
    public void setFormat(int n2, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFormatByArgumentIndex(int n2, Format format) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFormats(Format[] arrformat) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFormatsByArgumentIndex(Format[] arrformat) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (aa.c(this.getClass(), object.getClass())) {
            return false;
        }
        b b2 = (b)object;
        if (aa.c((Object)this.i, (Object)b2.i)) {
            return false;
        }
        return !aa.c((Object)this.j, (Object)b2.j);
    }

    @Override
    public int hashCode() {
        int n2 = super.hashCode();
        n2 = 31 * n2 + aa.a((Object)this.j);
        n2 = 31 * n2 + aa.a((Object)this.i);
        return n2;
    }

    private Format a(String string) {
        if (this.j != null) {
            c c2;
            String string2 = string;
            String string3 = null;
            int n2 = string.indexOf(44);
            if (n2 > 0) {
                string2 = string.substring(0, n2).trim();
                string3 = string.substring(n2 + 1).trim();
            }
            if ((c2 = (c)this.j.get(string2)) != null) {
                return c2.a(string2, string3, this.getLocale());
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private int a(String var1_1, ParsePosition var2_2) {
        var3_3 = var2_2.getIndex();
        this.c(var1_1, var2_2);
        var4_4 = new StringBuilder();
        var5_5 = false;
        while (!var5_5 && var2_2.getIndex() < var1_1.length()) {
            var6_6 = var1_1.charAt(var2_2.getIndex());
            if (!Character.isWhitespace(var6_6)) ** GOTO lbl-1000
            this.c(var1_1, var2_2);
            var6_6 = var1_1.charAt(var2_2.getIndex());
            if (var6_6 != ',' && var6_6 != '}') {
                var5_5 = true;
            } else lbl-1000:
            // 2 sources

            {
                if ((var6_6 == ',' || var6_6 == '}') && var4_4.length() > 0) {
                    try {
                        return Integer.parseInt(var4_4.toString());
                    }
                    catch (NumberFormatException var7_7) {
                        // empty catch block
                    }
                }
                var5_5 = Character.isDigit(var6_6) == false;
                var4_4.append(var6_6);
            }
            this.a(var2_2);
        }
        if (var5_5 == false) throw new IllegalArgumentException("Unterminated format element at position " + var3_3);
        throw new IllegalArgumentException("Invalid format argument index at position " + var3_3 + ": " + var1_1.substring(var3_3, var2_2.getIndex()));
    }

    private String b(String string, ParsePosition parsePosition) {
        int n2 = parsePosition.getIndex();
        this.c(string, parsePosition);
        int n3 = parsePosition.getIndex();
        int n4 = 1;
        while (parsePosition.getIndex() < string.length()) {
            switch (string.charAt(parsePosition.getIndex())) {
                case '{': {
                    ++n4;
                    break;
                }
                case '}': {
                    if (--n4 != 0) break;
                    return string.substring(n3, parsePosition.getIndex());
                }
                case '\'': {
                    this.a(string, parsePosition, false);
                    break;
                }
            }
            this.a(parsePosition);
        }
        throw new IllegalArgumentException("Unterminated format element at position " + n2);
    }

    private String a(String string, ArrayList arrayList) {
        if (!this.a(arrayList)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(string.length() * 2);
        ParsePosition parsePosition = new ParsePosition(0);
        int n2 = -1;
        int n3 = 0;
        block5: while (parsePosition.getIndex() < string.length()) {
            char c2 = string.charAt(parsePosition.getIndex());
            switch (c2) {
                case '\'': {
                    this.a(string, parsePosition, stringBuilder, false);
                    break;
                }
                case '{': {
                    String string2;
                    stringBuilder.append('{').append(this.a(string, this.a(parsePosition)));
                    if (++n3 != 1 || (string2 = (String)arrayList.get(++n2)) == null) continue block5;
                    stringBuilder.append(',').append(string2);
                    break;
                }
                case '}': {
                    --n3;
                }
                default: {
                    stringBuilder.append(c2);
                    this.a(parsePosition);
                }
            }
        }
        return stringBuilder.toString();
    }

    private void c(String string, ParsePosition parsePosition) {
        int n2 = 0;
        char[] arrc = string.toCharArray();
        do {
            n2 = k.d().a(arrc, parsePosition.getIndex());
            parsePosition.setIndex(parsePosition.getIndex() + n2);
        } while (n2 > 0 && parsePosition.getIndex() < string.length());
    }

    private ParsePosition a(ParsePosition parsePosition) {
        parsePosition.setIndex(parsePosition.getIndex() + 1);
        return parsePosition;
    }

    private StringBuilder a(String string, ParsePosition parsePosition, StringBuilder stringBuilder, boolean bl2) {
        int n2 = parsePosition.getIndex();
        char[] arrc = string.toCharArray();
        if (bl2 && arrc[n2] == '\'') {
            this.a(parsePosition);
            return stringBuilder == null ? null : stringBuilder.append('\'');
        }
        int n3 = n2;
        for (int i2 = parsePosition.getIndex(); i2 < string.length(); ++i2) {
            if (bl2 && string.substring(i2).startsWith(d)) {
                stringBuilder.append(arrc, n3, parsePosition.getIndex() - n3).append('\'');
                parsePosition.setIndex(i2 + d.length());
                n3 = parsePosition.getIndex();
                continue;
            }
            switch (arrc[parsePosition.getIndex()]) {
                case '\'': {
                    this.a(parsePosition);
                    return stringBuilder == null ? null : stringBuilder.append(arrc, n3, parsePosition.getIndex() - n3);
                }
            }
            this.a(parsePosition);
        }
        throw new IllegalArgumentException("Unterminated quoted string at position " + n2);
    }

    private void a(String string, ParsePosition parsePosition, boolean bl2) {
        this.a(string, parsePosition, null, bl2);
    }

    private boolean a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return false;
        }
        for (Object e2 : collection) {
            if (e2 == null) continue;
            return true;
        }
        return false;
    }
}

