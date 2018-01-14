package bigdata3.service;

import java.util.List;

import bigdata3.domain.Template;

public interface TemplateService {
	public List<Template> list(int startIndex, int pageSize);

	public Template selectOne(int templateNo);

	public void insert(Template template);

	public void update(Template template);

	public void delete(int templateNo);

	public int count();
}
