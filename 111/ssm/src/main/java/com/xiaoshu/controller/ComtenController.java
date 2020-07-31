package com.xiaoshu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.config.util.ConfigUtil;
import com.xiaoshu.entity.Content;
import com.xiaoshu.entity.ContentVo;
import com.xiaoshu.entity.Operation;
import com.xiaoshu.service.ContentCategoryService;
import com.xiaoshu.service.ContentService;
import com.xiaoshu.service.OperationService;
import com.xiaoshu.util.StringUtil;
import com.xiaoshu.util.WriterUtil;

@Controller
@RequestMapping("content")
public class ComtenController extends LogController{
	static Logger logger = Logger.getLogger(ComtenController.class);

	@Autowired
	private ContentService contentService;
	
	@Autowired
	private ContentCategoryService ss ;
	
	@Autowired
	private OperationService operationService;
	
	
	@RequestMapping("contentIndex")
	public String index(HttpServletRequest request,Integer menuid) throws Exception{
		//List<ContentCategory> roleList = ss.findAll();
		List<Operation> operationList = operationService.findOperationIdsByMenuid(menuid);
	/*	List<String> list = new ArrayList<String>();
		list.add("禁用");
		list.add("启用");*/
		request.setAttribute("operationList", operationList);
		request.setAttribute("roleList", ss.findAll());
		return "content";
	}
	
	
	@RequestMapping(value="contentList",method=RequestMethod.POST)
	public void DeviceList(ContentVo contentVo,HttpServletRequest request,HttpServletResponse response,String offset,String limit) throws Exception{
		try {
			Integer pageSize = StringUtil.isEmpty(limit)?ConfigUtil.getPageSize():Integer.parseInt(limit);
			Integer pageNum =  (Integer.parseInt(offset)/pageSize)+1;
			PageInfo<ContentVo> deviceList= contentService.findAll(contentVo,pageNum,pageSize);
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("total",deviceList.getTotal() );
			jsonObj.put("rows", deviceList.getList());
	        WriterUtil.write(response,jsonObj.toString());
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	
	// 新增或修改
		@RequestMapping("reserveUser")
		public void reserveUser(Content content,HttpServletRequest request,HttpServletResponse response){
			Integer Contenid = content.getContenid();
			JSONObject result=new JSONObject();
			try {
				if (Contenid != null) {   // userId不为空 说明是修改
					content.setContenid(Contenid);
					contentService.updateUser(content);
						result.put("success", true);
					}else {   // 添加
						contentService.addUser(content);
						result.put("success", true);
					}
			
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("保存用户信息错误",e);
				result.put("success", true);
				result.put("errorMsg", "对不起，操作失败");
			}
			WriterUtil.write(response, result.toString());
		}
	
	
	@RequestMapping("deleteUser")
	public void delUser(HttpServletRequest request,HttpServletResponse response){
		JSONObject result=new JSONObject();
		try {
			String[] ids=request.getParameter("ids").split(",");
			for (String id : ids) {
				contentService.deleteUser(Integer.parseInt(id));
			}
			result.put("success", true);
			result.put("delNums", ids.length);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("删除用户信息错误",e);
			result.put("errorMsg", "对不起，删除失败");
		}
		WriterUtil.write(response, result.toString());
	}
	
	
	
	//导入
	
	
	
	/*@RequestMapping("in")
	public void inStudent(Content content,HttpServletResponse response, MultipartFile file) {

		JSONObject result = new JSONObject();
		try {
			// 创建WorkBook ，通过WorBook对象，获取上传的文件的内容
			HSSFWorkbook wb = new HSSFWorkbook(file.getInputStream());
			// 读取sheet对象
			HSSFSheet sheet = wb.getSheetAt(0);	
			// 读取行
			int lastRowNum = sheet.getLastRowNum();

			for (int i = 1; i <= lastRowNum ; i++) {

				HSSFRow row = sheet.getRow(i);
				Content s = new Content();
				// 姓名读取到了
				String contenttitle = row.getCell(1).getStringCellValue();
				s.setContenttitle(contenttitle);

				String sex = row.getCell(2).getStringCellValue();
				s.set
				
				String sdhobby= row.getCell(3).getStringCellValue();
				s.set
				
				// 需要将生日，从String转会Date
				String sdbirthday = row.getCell(4).getStringCellValue();
				s.setSdbirthday(sdbirthday);

				String mdname = row.getCell(5).getStringCellValue();
				Bumen bumen =bumenService.findID(mdname);
				s.setMid(bumen.getmDid());

				// 插入到数据库中
				empService.addEmp(s);

			}
			wb.close();
			result.put("success", true);
		} catch (Exception e) {
			e.printStackTrace();
			result.put("success", true);
			result.put("errorMsg", "对不起，操作失败");
		}
		WriterUtil.write(response, result.toString());
	}*/
}
