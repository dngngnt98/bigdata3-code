package bigdata3.dao;

import java.util.List;
import java.util.Map;

import bigdata3.domain.Template;

public interface TemplateDao {
  public List<Template> list(Map<String, Object> tempMap);
  public Template selectOne(int templateNo);
  public void insert(Template template);
  public void update(Template template);
  public void delete(int templateNo);
  public int count();
}
