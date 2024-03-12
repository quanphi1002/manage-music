package com.example.demoSpringBoot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

@Component
public class RequestAPI {
	@Autowired
	private Process cppAPI;
	private Writer nullWriter;
    @Bean
    public Process startCppAPI() throws IOException {
    	return Runtime.getRuntime().exec("D:\\Project\\Project_manage_music\\Project_PPL2\\manage_music\\manage_music.exe",
    			null,new File("D:\\Project\\Project_manage_music\\Project_PPL2\\manage_music\\") );
    	 
    }
    public BufferedReader getReader(int op) throws IOException, InterruptedException { 
        InputStream inputStream = new FileInputStream("D:\\Project\\Project_manage_music\\Project_PPL2\\manage_music\\API"+op+".txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        TimeUnit.MILLISECONDS.sleep(120);
        return reader; 
    }
    public BufferedWriter getWriter(int op) throws IOException, InterruptedException { 
        OutputStream outputStream = new FileOutputStream("D:\\Project\\Project_manage_music\\Project_PPL2\\manage_music\\API_In"+op+".txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
		BufferedWriter writer = new BufferedWriter(outputStreamWriter);
        TimeUnit.MILLISECONDS.sleep(120);
        return writer; 
    }
    public void receiveData(int option, String data) throws IOException, InterruptedException {
		OutputStreamWriter osw=new OutputStreamWriter(cppAPI.getOutputStream());
		BufferedWriter bw=new BufferedWriter(osw);
//		Writer bw = w.nullWriter();
		if(data!="") {
			BufferedWriter fileData=getWriter(option);
			fileData.write(data+"\n");
			fileData.close();
			System.out.println(data);
			TimeUnit.MILLISECONDS.sleep(200);
		}
		bw.write(option+"\n");
		bw.flush();
		System.out.println(option);
		TimeUnit.MILLISECONDS.sleep(100);
    }
    public void receiveData(int option, int id) throws IOException, InterruptedException {
		OutputStreamWriter osw=new OutputStreamWriter(cppAPI.getOutputStream());
		BufferedWriter bw=new BufferedWriter(osw);
//		Writer bw = w.nullWriter();
//		if(data!="") {
//			BufferedWriter fileData=getWriter(option);
//			fileData.write(data+"\n");
//			fileData.close();
//			System.out.println(data);
//			TimeUnit.MILLISECONDS.sleep(200);
//		}
		bw.write(option+"\n");
		bw.write(id+"\n");
		bw.flush();
		System.out.println(option);
		TimeUnit.MILLISECONDS.sleep(100);
    }
}
