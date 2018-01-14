package bigdata3.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bigdata3.dao.TemplateDao;
import bigdata3.domain.Template;
import bigdata3.service.TemplateService;

@Service
public class TemplateServiceImpl implements TemplateService {

	@Autowired
	TemplateDao templateDao;

	@Override
	public List<Template> list(int startIndex, int pageSize) {
		HashMap<String, Object> tempMap = new HashMap<>();
		tempMap.put("startIndex", (startIndex - 1) * pageSize);
		tempMap.put("pageSize", pageSize);
		return templateDao.list(tempMap);
	}

	@Override
	public Template selectOne(int templatempNo) {
		return templateDao.selectOne(templatempNo);
	}

	@Override
	public void insert(Template template) {
		templateDao.insert(template);
	}

	@Override
	public void update(Template template) {
		templateDao.update(template);
	}

	@Override
	public void delete(int templatempNo) {
		templateDao.delete(templatempNo);
	}

	@Override
	public int count() {
		return templateDao.count();
	}

}
