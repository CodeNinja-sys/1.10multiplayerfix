/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.text.FieldPosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public interface c {
    public String a(long var1);

    public String a(Date var1);

    public String a(Calendar var1);

    public StringBuffer a(long var1, StringBuffer var3);

    public StringBuffer a(Date var1, StringBuffer var2);

    public StringBuffer a(Calendar var1, StringBuffer var2);

    public String a();

    public TimeZone b();

    public Locale c();

    public StringBuffer format(Object var1, StringBuffer var2, FieldPosition var3);
}

