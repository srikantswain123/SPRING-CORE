package com.nt.beans;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.TimeZone;

import lombok.Data;
@Data
public class PersonInfo {
	
	private long adharno;
	private String pname;
	private String[] address;
	private float salary;
	private File potopath;
	private Currency countryCurency;
	private Date dob;
	private Class javaClass;
	private Class[] javaClases;
	private InputStream inputfile;
	private URL fbUrl;
	private Locale curentLocale;
	private TimeZone timezone;
	private Properties props;

}
