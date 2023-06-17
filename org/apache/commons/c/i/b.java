/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public interface b {
    public Date a(String var1);

    public Date a(String var1, ParsePosition var2);

    public String a();

    public TimeZone b();

    public Locale c();

    public Object parseObject(String var1);

    public Object parseObject(String var1, ParsePosition var2);
}

