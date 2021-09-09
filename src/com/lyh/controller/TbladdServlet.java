package com.lyh.controller;

import com.lyh.bean.Tbl_purchase;
import com.lyh.dao.TblpurchaseDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TbladdServlet",urlPatterns = "/TbladdServlet")
public class TbladdServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=UTF-8");

        String pType = req.getParameter("pType");
        String pName = req.getParameter("pName");
        String pUnit = req.getParameter("pUnit");
        String pNum = req.getParameter("pNum");
        String pPerson = req.getParameter("pPerson");

        //调用dao层
        Tbl_purchase tbl = new Tbl_purchase();
        TblpurchaseDao tblDao = new TblpurchaseDao();
        tbl.setpType(pType);
        tbl.setpName(pName);
        tbl.setpUnit(pUnit);
        tbl.setpNum(Integer.parseInt(pNum));
        tbl.setpPerson(pPerson);
        System.out.println("tbl = " + tbl);
        int i = tblDao.addTbl(tbl);
        System.out.println("提交成功" + i);
    }
}
