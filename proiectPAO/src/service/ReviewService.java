package service;
import model.Review;
import repository.ReviewRepository;
import java.util.ArrayList;
public class ReviewService {
    private ReviewRepository reviewRepository;
    public ReviewService(){
        reviewRepository=new ReviewRepository();
    }
    public void addReview(Review r){
        reviewRepository.addReview(r);
    }
    public void removeReview(Review r){
        reviewRepository.removeReview(r);
    }



}
