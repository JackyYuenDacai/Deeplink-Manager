package com.jydacai.DLMServer.utils;

import java.net.InetAddress;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import java.io.File;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.City;
import com.maxmind.geoip2.record.Country;
import com.maxmind.geoip2.record.Location;
import com.maxmind.geoip2.record.Postal;
import com.maxmind.geoip2.record.Subdivision;


public class ifconfig {
	
	private static final Logger LOG= LoggerFactory.getLogger(ifconfig.class);
	

	// This creates the DatabaseReader object. To improve performance, reuse
	// the object across lookups. The object is thread-safe.
	
	static public JSONObject getIpConfig(String ipAddr) {
		ipconfig ret = new ipconfig();
		JSONObject jobj = new JSONObject();
		File geoAsn	= null;File geoCity = null;
		try {
			geoAsn = new ClassPathResource("/GeoLite2/GeoLite2-ASN.mmdb").getFile();
			geoCity = new ClassPathResource("/GeoLite2/GeoLite2-City.mmdb").getFile();
		}catch(Exception ex) {
			LOG.error(ex.getMessage());
			return jobj;
		}
		
		try (DatabaseReader reader = new DatabaseReader.Builder(geoAsn).build()) {
		    InetAddress ipAddress = InetAddress.getByName(ipAddr);
		    com.maxmind.geoip2.model.AsnResponse response = reader.asn(ipAddress);
		    ret.AsnNo = response.getAutonomousSystemNumber();
		    ret.AsnOrg = response.getAutonomousSystemOrganization();
		    
		    jobj.put("asn", response.getAutonomousSystemNumber());
		    jobj.put("asnOrg", response.getAutonomousSystemOrganization());
		    

		}catch(Exception ex) {
			LOG.error(ex.getMessage());
		}
		
		try(DatabaseReader reader = new DatabaseReader.Builder(geoCity).build()){

			InetAddress ipAddress = InetAddress.getByName(ipAddr);
	
			CityResponse response = reader.city(ipAddress);
	
			Country country = response.getCountry();
			jobj.put("ISOCode", country.getIsoCode());
			jobj.put("country", country.getName());
			ret.ISOCode=(country.getIsoCode());            // 'US'
			ret.Country=(country.getName());               // 'United States'
	
	
			Subdivision subdivision = response.getMostSpecificSubdivision();
			
			jobj.put("subdivision", subdivision.getName());
			jobj.put("subISOCode", subdivision.getIsoCode());
			ret.Subdivision=(subdivision.getName());    // 'Minnesota'
			ret.SubISOCode=(subdivision.getIsoCode()); // 'MN'
	
			City city = response.getCity();
			
			jobj.put("city",city.getName());
			ret.City=(city.getName()); // 'Minneapolis'
	
			Postal postal = response.getPostal();
			jobj.put("postal", postal.getCode());
			ret.Postal=(postal.getCode()); // '55455'
	
			Location location = response.getLocation();
			
			jobj.put("geoLongitude", location.getLongitude());
			jobj.put("geoLatitude", location.getLatitude());
			ret.geolo = location.getLongitude();
			ret.geola = location.getLatitude();

		}catch(Exception ex) {
			LOG.error(ex.getMessage());
		}
		return jobj;
	}
}
