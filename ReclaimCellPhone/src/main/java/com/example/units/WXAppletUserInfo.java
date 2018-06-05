package com.example.units;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class WXAppletUserInfo {
	
	public static String httpsRequest(String requestUrl,String requestMethod,String outputStr){  
		 StringBuffer buffer=null;  
		    try{  
		    //创建SSLContext  
		    SSLContext sslContext=SSLContext.getInstance("SSL");  
		    TrustManager[] tm={new MyX509TrustManager()};  
		    //初始化  
		    sslContext.init(null, tm, new java.security.SecureRandom());;  
		    //获取SSLSocketFactory对象  
		    SSLSocketFactory ssf=sslContext.getSocketFactory();  
		    URL url=new URL(requestUrl);  
		    HttpsURLConnection conn=(HttpsURLConnection)url.openConnection();  
		    conn.setDoOutput(true);
		    conn.setDoInput(true);
		    conn.setUseCaches(false);
		    conn.setRequestMethod(requestMethod);  
		    //设置当前实例使用的SSLSoctetFactory  
		    conn.setSSLSocketFactory(ssf);  
		    conn.connect();  
		    //往服务器端写内容  
		    if(null!=outputStr){  
		        OutputStream os=conn.getOutputStream();  
		        os.write(outputStr.getBytes("utf-8"));  
		        os.close();  
		    }  
		    //读取服务器端返回的内容  
		    InputStream is=conn.getInputStream();  
		    InputStreamReader isr=new InputStreamReader(is,"utf-8");  
		    BufferedReader br=new BufferedReader(isr);  
		    buffer=new StringBuffer();  
		    String line=null;  
		    while((line=br.readLine())!=null){  
		        buffer.append(line);  
		    }  
		    }catch(Exception e){  
		        e.printStackTrace();  
		    }  
		    return buffer.toString();  
		} 
		
		public static void main(String[] args) {
			//sendGet(url, "appid="+appid+"&secret="+secret+"&js_code="+js_code+"&grant_type="+grant_type);
			String s;
			try {
				String url="https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";
				String appid="wx3230367438370bc5";
				String secret="Wang376515373";
				String js_code="071lPYLy17Jo9g0v15Ky1Wf2My1lPYLF";
				String grant_type="authorization_code";
				s = httpsRequest("https://api.weixin.qq.com/sns/jscode2session?appid=wx3230367438370bc5&secret=d3e38ced0c0a74e0313ac1e7ac9dea1d&js_code=033UeflX0cdTj22RYWmX0kyflX0UeflP&grant_type=authorization_code","GET",null);
				 System.out.println(s);
			} catch (Exception e) {
				System.out.println("异常");
				e.printStackTrace();
			}  
		}
}
