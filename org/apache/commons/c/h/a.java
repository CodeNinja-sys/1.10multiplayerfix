/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class a
extends Format {
    private static final long a = -4329119827877627683L;
    private final Format b;
    private final Format c;

    public a(Format format, Format format2) {
        this.b = format;
        this.c = format2;
    }

    @Override
    public StringBuffer format(Object object, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.c.format(object, stringBuffer, fieldPosition);
    }

    @Override
    public Object parseObject(String string, ParsePosition parsePosition) {
        return this.b.parseObject(string, parsePosition);
    }

    public Format a() {
        return this.b;
    }

    public Format b() {
        return this.c;
    }

    public String a(String string) {
        return this.format(this.parseObject(string));
    }
}

