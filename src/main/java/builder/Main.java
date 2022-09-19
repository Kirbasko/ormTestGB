package builder;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import ormTestGB.db.dao.ProductsMapper;
import ormTestGB.db.model.Products;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
                    .build(Resources.getResourceAsStream("myBatisConfig.xml"));

            try (SqlSession session = sessionFactory.openSession()) {
                ProductsMapper productsMapper = session.getMapper(ProductsMapper.class);
                Products product = productsMapper.selectByPrimaryKey(1344L);
                System.out.println(product);
                Products dellProducts = productsMapper.deleteByPrimaryKey(1344L);
                System.out.println(dellProducts);
            }
        }

}