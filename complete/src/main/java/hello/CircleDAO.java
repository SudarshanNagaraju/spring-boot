package hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;

import beans.CircleMaster;

@Repository
@EntityScan(basePackageClasses=CircleMaster.class)
public class CircleDAO {

	/*@Autowired
	private SessionFactory sessionfactory;*/
	
	
	/*@PersistenceContext	
	private EntityManager entityManager;*/	
	//CircleMaster circle=new CircleMaster();
	Integer ref=0;
	public Integer getCircleById(CircleMaster id) {
		
		/*Session session=null;
		
		try {
			
			System.out.println("Data Entity"+id);
			
			session=sessionfactory.openSession();
			session.beginTransaction();
			
			 ref=(Integer) session.save(id);
			
			
			System.out.println("Id after saving"+ref);
			
			session.getTransaction().commit();
			
		}catch (Exception e) {
				e.printStackTrace();
		}*/
		
		//System.out.println("ID"+circle.getNAME());
		
		return ref;
		//return entityManager.find(CircleMaster.class, id);
	}
	/*@SuppressWarnings("unchecked")
	public List<CircleMaster> getAllArticles() {
		String hql = "FROM Article";
		return (List<CircleMaster>) entityManager.createQuery(hql).getResultList();
	}	
	public void addArticle(CircleMaster article) {
		entityManager.persist(article);
	}*/
	/*public void updateArticle(CircleMaster article) {
		CircleMaster artcl = getArticleById(article.get);
		artcl.setTitle(article.get);
		artcl.setCategory(article.getCategory());
		entityManager.flush();
	}*/
	
	
}
