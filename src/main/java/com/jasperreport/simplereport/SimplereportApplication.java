package com.jasperreport.simplereport;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jasperreport.simplereport.data.Data;
import com.jasperreport.simplereport.data.DataBean;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@SpringBootApplication
public class SimplereportApplication {

    private static final String REPORT_pdf = "/report.pdf";
    private static final String REPORT_pattern = "jrxml/first_report.jrxml";

    public void create() throws JRException {
        Data dataBeanMaker = new Data();
        ArrayList<DataBean> dataBeanList = dataBeanMaker.getDataBeanList();

        JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(
                dataBeanList);

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("DATE", new Date());

        JasperReport jasperReport = JasperCompileManager
                .compileReport(this.getClass().getClassLoader().getResourceAsStream(REPORT_pattern));

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, beanColDataSource);

        JasperExportManager.exportReportToPdfFile(jasperPrint, Paths.get("") + REPORT_pdf);
    }

	public static void main(String[] args) {
		SpringApplication.run(SimplereportApplication.class, args);

        System.out.println("Begin report");
        try {
            new SimplereportApplication().create();
            System.out.println("Report has been finished");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        System.exit(0);

	}

}
